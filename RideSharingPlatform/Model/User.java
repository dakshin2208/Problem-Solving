package RideSharingPlatform.Model;

public class User {
    private int userId;
    private String userName;
    private String phoNo;

    public User(){}
    public User(int userId , String userName , String phoNo){
        this.userId = userId;
        this.userName = userName;
        this.phoNo = phoNo;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoNo() {
        return phoNo;
    }
}
