package xin.gojay.nmid.service.impl;

import org.springframework.stereotype.Service;
import xin.gojay.nmid.dao.UserDao;
import xin.gojay.nmid.entity.User;
import xin.gojay.nmid.service.UserService;
import xin.gojay.nmid.utils.ResponseUtil;

import javax.annotation.Resource;

/**
 * @author Gojay
 * @date 2017/11/30
 */
@Service
public class UserServiceImpl implements UserService {
    private static final int SUCCESS = 1;
    private static final int FAIL = 0;

    @Resource
    private UserDao userDao;

    @Override
    public ResponseUtil signIn(User user) {
        // 查询本地数据库是否存在该用户
        User existedUser = userDao.getUserById(user.getId());
        if (existedUser != null && user.getPassword().equals(existedUser.getPassword())) {
            ResponseUtil responseUtil = new ResponseUtil(200, "success");
            responseUtil.setBody(existedUser);
            return responseUtil;
        }
        // 若不存在则储存用户信息
        if (userDao.insertUser(user) != FAIL) {
            ResponseUtil responseUtil = new ResponseUtil(200, "success");
            responseUtil.setBody(user);
            return responseUtil;
        }
        return new ResponseUtil(500, "error");
    }
}
