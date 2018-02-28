package xin.gojay.nmid.dao;

import xin.gojay.nmid.entity.Activity;
import xin.gojay.nmid.entity.UserActivity;

import java.util.List;

/**
 * @author Gojay
 * @date 2018/2/4
 */
public interface ActivityDao {
    /**
     * 根据id获取活动信息
     * @param id 活动ID
     * @return 活动实体
     */
    Activity getActivityById(int id);

    /**
     * 获取所有活动
     * @return 活动列表
     */
    List<Activity> getAllActivity();

    /**
     * 用户加入活动
     * @param mapper 用户ID与活动ID的映射
     * @return 成功标志
     */
    int insertUserActivity(UserActivity mapper);
}
