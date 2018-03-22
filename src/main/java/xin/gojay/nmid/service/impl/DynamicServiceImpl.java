package xin.gojay.nmid.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import xin.gojay.nmid.dao.DynamicDao;
import xin.gojay.nmid.entity.Dynamic;
import xin.gojay.nmid.service.DynamicService;
import xin.gojay.nmid.utils.ImageUtil;
import xin.gojay.nmid.utils.ResponseUtil;

import java.util.List;

/**
 * @author Gojay
 * @date 2018/3/21
 */
@Service
public class DynamicServiceImpl implements DynamicService {
    private final DynamicDao dynamicDao;
    private ResponseUtil responseUtil = null;

    @Autowired
    public DynamicServiceImpl(DynamicDao dynamicDao) {
        this.dynamicDao = dynamicDao;
    }

    @Override
    public ResponseUtil getDynamic(int dynamicId) {
        Dynamic dynamic = dynamicDao.getDynamic(dynamicId);
        if (dynamic == null) {
            responseUtil = new ResponseUtil(400, "ERROR#该动态不存在");
        }

        responseUtil = new ResponseUtil(200, "OK#成功返回");
        responseUtil.setBody(dynamic);
        return responseUtil;
    }

    @Override
    public ResponseUtil getAllDynamic() {
        List<Dynamic> dynamicList = dynamicDao.getAllDynamic();
        responseUtil = new ResponseUtil(200, "OK#成功返回");
        responseUtil.setBody(dynamicList);
        return responseUtil;
    }

    @Override
    public ResponseUtil createDynamic(Dynamic dynamic, MultipartHttpServletRequest request) {
        // 储存动态中上传图片
        StringBuilder picName = saveImage(request);
        dynamic.setDynamicPic(picName.toString());
        // 储存动态消息
        if (dynamicDao.insertDynamic(dynamic) == 0) {
            responseUtil = new ResponseUtil(500, "ERROR#发布动态失败");
        }
        return getDynamic(dynamic.getDynamicId());
    }

    @Override
    public StringBuilder saveImage(MultipartHttpServletRequest request) {
        StringBuilder names = new StringBuilder();
        List<MultipartFile> files = request.getFiles("file");
        if (files.isEmpty()) {
            return null;
        }
        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                continue;
            }
            // 储存图片到本地项目路径
            String name = ImageUtil.saveImage(file, request, "/images/dynamic");
            /// 获取图片名称
            if (name == null) {
                continue;
            }
            // 储存图片名称
            if (names.length() != 0) {
                names.append(",");
            }
            names.append(name);
        }
        if (names.length() == 0) {
            return null;
        }
        return names;
    }
}
