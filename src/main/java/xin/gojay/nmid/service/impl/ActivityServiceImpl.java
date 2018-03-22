package xin.gojay.nmid.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import xin.gojay.nmid.dao.ActivityDao;
import xin.gojay.nmid.entity.Activity;
import xin.gojay.nmid.entity.UserActivity;
import xin.gojay.nmid.service.ActivityService;
import xin.gojay.nmid.utils.ImageUtil;
import xin.gojay.nmid.utils.ResponseUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gojay
 * @date 2018/2/4
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    private final ActivityDao activityDao;
    private static final int FALSE = 0;
    private ResponseUtil responseUtil = null;

    @Autowired
    public ActivityServiceImpl(ActivityDao activityDao) {
        this.activityDao = activityDao;
    }

    @Override
    public ResponseUtil getActivityById(int id) {
        Activity activity = activityDao.getActivityById(id);
        if (activity == null) {
            responseUtil = new ResponseUtil(400, "ERROR#该活动不存在");
        }

        responseUtil = new ResponseUtil(200, "OK#成功返回");
        responseUtil.setBody(activity);
        return responseUtil;
    }

    @Override
    public ResponseUtil getAllActivity() {
        List<Activity> activityList = activityDao.getAllActivity();
        responseUtil = new ResponseUtil(200, "OK#成功返回");
        responseUtil.setBody(activityList);
        return responseUtil;
    }

    @Override
    public ResponseUtil joinActivity(int userId, int activityId) {
        UserActivity mapper = new UserActivity();
        mapper.setUserId(userId);
        mapper.setActivityId(activityId);
        if (activityDao.insertUserActivity(mapper) == FALSE) {
            responseUtil = new ResponseUtil(500, "ERROR#加入活动失败");
        }
        responseUtil = new ResponseUtil(200, "OK#成功返回");
        responseUtil.setBody(mapper);
        return responseUtil;
    }

    @Override
    public ResponseUtil createActivity(Activity activity, MultipartHttpServletRequest request) {
        // 储存活动图片
        StringBuilder picName = saveImage(request);
        activity.setActivityPic(picName.toString());
        // 储存活动信息
        if (activityDao.insertActivity(activity) == FALSE) {
            responseUtil = new ResponseUtil(500, "ERROR#创建活动失败");
        }
        return getActivityById(activity.getActivityId());
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
            String name = ImageUtil.saveImage(file, request, "/images/activity");
            /// 获取图片名称
            // System.out.println(name);
            if (name == null) {
                continue;
            }
            // 储存图片名称
            if (names.length() != 0) {
                names.append(",");
            }
            names.append(name);
        }
        if (names.length() == FALSE) {
            return null;
        }
        return names;
    }
}
