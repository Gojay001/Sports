package xin.gojay.nmid.web;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.gojay.nmid.entity.Activity;
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

    @RequestMapping(value = "/createActivity",method = RequestMethod.POST)
    @ResponseBody
    public ResponseUtil createActivity(@Param("activityName") String activityName,
                                       @Param("initiator") String initiator,
                                       @Param("content") String content,
                                       @Param("reamarks") String remarks,
                                       @Param("startTime") String startTime,
                                       @Param("endTime") String endTime,
                                       @Param("location") String location,
                                       @Param("peopleNeeds") int peopleNeeds,
                                       @Param("activityOrRace") String activityOrRace) {
        Activity activity = new Activity();
        activity.setActivityName(activityName);
        activity.setInitiator(initiator);
        activity.setContent(content);
        activity.setRemarks(remarks);
        activity.setStartTime(startTime);
        activity.setEndTime(endTime);
        activity.setLocation(location);
        activity.setPeopleNeeds(peopleNeeds);
        activity.setActivityOrRace(activityOrRace);
        return activityService.createActivity(activity);
    }
}
