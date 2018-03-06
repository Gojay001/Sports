package xin.gojay.nmid.entity;

import java.sql.Timestamp;

/**
 * @author Gojay
 * @date 2017/11/30
 */
public class Activity {
    private int activityId;
    private String activityName;
    private String initiator;
    private String content;
    private String remarks;
    private Timestamp initTime;
    private String startTime;
    private String endTime;
    private String location;
    private int peopleNeeds;
    private int peopleHave;
    private String activityPic;
    private String activityOrRace;
    private int clickNumber;

    public Activity() {
    }

    public Activity(int activityId, String activityName, String initiator, String content,
                    String remarks, Timestamp initTime, String startTime, String endTime, String location,
                    int peopleNeeds, int peopleHave, String activityPic, String activityOrRace, int clickNumber) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.initiator = initiator;
        this.content = content;
        this.remarks = remarks;
        this.initTime = initTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.peopleNeeds = peopleNeeds;
        this.peopleHave = peopleHave;
        this.activityPic = activityPic;
        this.activityOrRace = activityOrRace;
        this.clickNumber = clickNumber;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", activityName='" + activityName + '\'' +
                ", initiator='" + initiator + '\'' +
                ", content='" + content + '\'' +
                ", remarks='" + remarks + '\'' +
                ", initTime=" + initTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", location='" + location + '\'' +
                ", peopleNeeds=" + peopleNeeds +
                ", peopleHave=" + peopleHave +
                ", activityPic='" + activityPic + '\'' +
                ", activityOrRace='" + activityOrRace + '\'' +
                ", clickNumber=" + clickNumber +
                '}';
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Timestamp getInitTime() {
        return initTime;
    }

    public void setInitTime(Timestamp initTime) {
        this.initTime = initTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPeopleNeeds() {
        return peopleNeeds;
    }

    public void setPeopleNeeds(int peopleNeeds) {
        this.peopleNeeds = peopleNeeds;
    }

    public int getPeopleHave() {
        return peopleHave;
    }

    public void setPeopleHave(int peopleHave) {
        this.peopleHave = peopleHave;
    }

    public String getActivityPic() {
        return activityPic;
    }

    public void setActivityPic(String activityPic) {
        this.activityPic = activityPic;
    }

    public String getActivityOrRace() {
        return activityOrRace;
    }

    public void setActivityOrRace(String activityOrRace) {
        this.activityOrRace = activityOrRace;
    }

    public int getClickNumber() {
        return clickNumber;
    }

    public void setClickNumber(int clickNumber) {
        this.clickNumber = clickNumber;
    }
}
