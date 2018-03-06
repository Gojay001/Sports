package xin.gojay.nmid.entity;

/**
 * @author Gojay
 * @date 2017/11/30
 */
public class User {
    private int id;
    private String classNum;
    private String password;
    private String userName;
    private String gender;
    private int major;
    private String college;
    private String nickName;
    private String profilePic;
    private String control;
    private String qqNum;
    private String telephoneNum;
    private String sportMajor;
    private String sportAge;
    private int ability;

    public User() {
    }

    public User(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public User(int id, String classNum, String password, String userName, String gender,
                int major, String college, String nickName, String profilePic, String control,
                String qqNum, String telephoneNum, String sportMajor, String sportAge, int ability) {
        this.id = id;
        this.classNum = classNum;
        this.password = password;
        this.userName = userName;
        this.gender = gender;
        this.major = major;
        this.college = college;
        this.nickName = nickName;
        this.profilePic = profilePic;
        this.control = control;
        this.qqNum = qqNum;
        this.telephoneNum = telephoneNum;
        this.sportMajor = sportMajor;
        this.sportAge = sportAge;
        this.ability = ability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
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

    public String getSportMajor() {
        return sportMajor;
    }

    public void setSportMajor(String sportMajor) {
        this.sportMajor = sportMajor;
    }

    public String getSportAge() {
        return sportAge;
    }

    public void setSportAge(String sportAge) {
        this.sportAge = sportAge;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", classNum='" + classNum + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                ", major=" + major +
                ", college='" + college + '\'' +
                ", nickName='" + nickName + '\'' +
                ", profilePic='" + profilePic + '\'' +
                ", control='" + control + '\'' +
                ", qqNum='" + qqNum + '\'' +
                ", telephoneNum='" + telephoneNum + '\'' +
                ", sportMajor='" + sportMajor + '\'' +
                ", sportAge='" + sportAge + '\'' +
                ", ability=" + ability +
                '}';
    }
}
