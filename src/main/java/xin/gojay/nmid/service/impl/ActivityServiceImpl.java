package xin.gojay.nmid.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.gojay.nmid.dao.ActivityDao;
import xin.gojay.nmid.entity.Activity;
import xin.gojay.nmid.entity.UserActivity;
import xin.gojay.nmid.service.ActivityService;
import xin.gojay.nmid.utils.ResponseUtil;

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
    public ResponseUtil createActivity(Activity activity) {
        if (activityDao.insertActivity(activity) == FALSE) {
            responseUtil = new ResponseUtil(500, "ERROR#创建活动失败");
        }
        return getActivityById(activity.getActivityId());
    }
}
