package xin.gojay.nmid.service;

import xin.gojay.nmid.utils.ResponseUtil;

/**
 * @author Gojay
 * @date 2018/2/4
 */
public interface ActivityService {
    /**
     * 获取活动
     * @param id 活动ID
     * @return 响应消息
     */
    ResponseUtil getActivityById(int id);

    /**
     * 获取所有活动
     * @return 响应消息
     */
    ResponseUtil getAllActivity();

    /**
     * 用户加入活动
     * @param userId 用户ID
     * @param activityId 活动ID
     * @return 响应消息
     */
    ResponseUtil joinActivity(int userId, int activityId);
}
