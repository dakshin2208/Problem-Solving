package LibararyManagementSystem.Model;

public class User {
    private int userId;
    private String name;
    private String phoneNumber;

    public User(int userId , String name , String phoneNumber){
        this.userId = userId;
        this.name =name;
        this.phoneNumber = phoneNumber;
    }

    public int getUserId(){
        return this.userId;
    }

    public String getName(){
        return this.name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}