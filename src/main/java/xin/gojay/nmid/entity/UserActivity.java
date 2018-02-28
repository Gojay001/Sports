package xin.gojay.nmid.entity;

/**
 * @author Gojay
 * @date 2018/2/12
 */
public class UserActivity {
    private int serialNum;
    private int userId;
    private int activityId;

    public UserActivity() {
    }

    public UserActivity(int serialNum, int userId, int activityId) {
        this.serialNum = serialNum;
        this.userId = userId;
        this.activityId = activityId;
    }

    @Override
    public String toString() {
        return "UserActivity{" +
                "serialNum=" + serialNum +
                ", userId=" + userId +
                ", activityId=" + activityId +
                '}';
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }
}
