package xin.gojay.nmid.entity;

import java.sql.Timestamp;

/**
 * @author Gojay
 * @date 2018/3/21
 */
public class Dynamic {
    private int dynamicId;
    private String userId;
    private Timestamp initTime;
    private String words;
    private String dynamicPic;
    private int likeNum;

    public Dynamic() {
    }

    public Dynamic(int dynamicId, String userId, Timestamp initTime, String words, String dynamicPic, int likeNum) {
        this.dynamicId = dynamicId;
        this.userId = userId;
        this.initTime = initTime;
        this.words = words;
        this.dynamicPic = dynamicPic;
        this.likeNum = likeNum;
    }

    @Override
    public String toString() {
        return "Dynamic{" +
                "dynamicId=" + dynamicId +
                ", userId='" + userId + '\'' +
                ", initTime=" + initTime +
                ", words='" + words + '\'' +
                ", dynamicPic='" + dynamicPic + '\'' +
                ", likeNum=" + likeNum +
                '}';
    }

    public int getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(int dynamicId) {
        this.dynamicId = dynamicId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Timestamp getInitTime() {
        return initTime;
    }

    public void setInitTime(Timestamp initTime) {
        this.initTime = initTime;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String getDynamicPic() {
        return dynamicPic;
    }

    public void setDynamicPic(String dynamicPic) {
        this.dynamicPic = dynamicPic;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }
}
