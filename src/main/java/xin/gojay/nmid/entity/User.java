package xin.gojay.nmid.entity;

/**
 * @author Gojay
 * @date 2017/11/30
 */
public class User {
    private Integer id;
    private String userName;
    private String gender;
    private String password;
    private String nickname;
    private String qqNum;
    private String telephoneNum;
    private String profilePic;
    private int ability;
    private String classNum;
    private String control;
    private String college;

    public User() {
    }

    public User(Integer id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public User(Integer id, String userName, String gender,
                String password, String nickname, String qqNum, String telephoneNum,
                String profilePic, int ability, String classNum, String control, String college) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
        this.password = password;
        this.nickname = nickname;
        this.qqNum = qqNum;
        this.telephoneNum = telephoneNum;
        this.profilePic = profilePic;
        this.ability = ability;
        this.classNum = classNum;
        this.control = control;
        this.college = college;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", qqNum='" + qqNum + '\'' +
                ", telephoneNum='" + telephoneNum + '\'' +
                ", profilePic='" + profilePic + '\'' +
                ", ability=" + ability +
                ", classNum='" + classNum + '\'' +
                ", control='" + control + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
