package xin.gojay.nmid.service;

import xin.gojay.nmid.entity.User;
import xin.gojay.nmid.utils.ResponseUtil;

/**
 * @author Gojay
 * @date 2017/11/30
 */
public interface UserService {
    /**
     * 用户登录
     * @param user 用户登录信息
     * @return 响应信息
     */
    ResponseUtil searchUser(User user);

    /**
     * 添加用户
     * @param user 用户实体
     * @return 响应消息
     */
    ResponseUtil createUser(User user);

    /**
     * 查询用户参加的活动
     * @param userId 用户ID
     * @return 响应消息
     */
    ResponseUtil searchActivity(int userId);
}
