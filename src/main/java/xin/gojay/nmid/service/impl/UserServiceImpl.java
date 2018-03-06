package xin.gojay.nmid.service.impl;

import org.springframework.stereotype.Service;
import xin.gojay.nmid.dao.UserDao;
import xin.gojay.nmid.entity.User;
import xin.gojay.nmid.service.UserService;
import xin.gojay.nmid.utils.ResponseUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
    public ResponseUtil searchUser(User user) {
        User existedUser = userDao.getUserById(user.getId());
        if (existedUser != null) {
            //用户id与密码匹配成功则返回
            if (user.getPassword().equals(existedUser.getPassword())) {
                ResponseUtil responseUtil = new ResponseUtil(200, "OK#成功返回");
                responseUtil.setBody(existedUser);
                return responseUtil;
            }
            return new ResponseUtil(400, "ERROR#密码错误");
        }
        return new ResponseUtil(400, "ERROR#用户不存在");
    }

    @Override
    public ResponseUtil createUser(User user) {
        if (userDao.insertUser(user) == FAIL) {
            return new ResponseUtil(500, "ERROR#添加用户失败");
        }
        ResponseUtil responseUtil = new ResponseUtil(200, "OK#成功返回");
        responseUtil.setBody(user);
        return responseUtil;
    }

    @Override
    public ResponseUtil searchActivity(int userId) {
        List<Integer> activityIdList;
        activityIdList = userDao.getActivity(userId);
        ResponseUtil responseUtil = new ResponseUtil(200, "OK#成功返回");
        responseUtil.setBody(activityIdList);
        return responseUtil;
    }
}
