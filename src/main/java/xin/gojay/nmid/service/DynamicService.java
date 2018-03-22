package xin.gojay.nmid.service;

import org.springframework.web.multipart.MultipartHttpServletRequest;
import xin.gojay.nmid.entity.Dynamic;
import xin.gojay.nmid.utils.ResponseUtil;

/**
 * @author Gojay
 * @date 2018/3/21
 */
public interface DynamicService {

    /**
     * 根据动态消息ID获取动态信息
     * @param dynamicId 动态ID
     * @return 响应消息
     */
    ResponseUtil getDynamic(int dynamicId);

    /**
     * 获取所有动态消息
     * @return 响应消息
     */
    ResponseUtil getAllDynamic();

    /**
     * 创建一条动态
     * @param dynamic 一条动态信息
     * @param request 请求
     * @return 响应消息
     */
    ResponseUtil createDynamic(Dynamic dynamic, MultipartHttpServletRequest request);

    /**
     * 存储动态上传图片
     * @param request 请求
     * @return 图片名称
     */
    StringBuilder saveImage(MultipartHttpServletRequest request);
}
