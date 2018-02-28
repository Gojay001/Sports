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
    ResponseUtil signIn(User user);
}
