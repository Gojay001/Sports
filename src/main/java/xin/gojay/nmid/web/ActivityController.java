package xin.gojay.nmid.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.gojay.nmid.service.ActivityService;
import xin.gojay.nmid.utils.ResponseUtil;

/**
 * @author Gojay
 * @date 2018/2/4
 */
@Controller
@RequestMapping("/api/activity")
public class ActivityController {
    private final ActivityService activityService;

    @Autowired
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @RequestMapping(value = "/getActivity/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseUtil getActivity(@PathVariable int id) {
        return activityService.getActivityById(id);
    }

    @RequestMapping(value = "/getAllActivity",method = RequestMethod.GET)
    @ResponseBody
    public ResponseUtil getActivity() {
        return activityService.getAllActivity();
    }

    @RequestMapping(value = "/joinActivity/{userId}/{activityId}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseUtil joinActivity(@PathVariable int userId,
                                     @PathVariable int activityId) {
        return activityService.joinActivity(userId, activityId);
    }
}
