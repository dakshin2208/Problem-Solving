package MedicineManagementSystem.Model;

public class User {
    private int userId;
    private String userName;
    private String phNo;

    public User(){};

    public User(int userId , String userName , String phNo){
        this.userId = userId;
        this.userName = userName;
        this.phNo = phNo;
    }

    public String getUserName(){
        return userName;
    }
    public String getPhNo(){
        return phNo;
    }


}
