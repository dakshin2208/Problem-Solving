package LldPractice.Model;

public class User {
    int user_id;
    String name;
    String password;
    String phoneNo;
    String Address;

    User(){}

    int autoIncrementId = 0;//serial in db

    public User(String name, String password, String phoneNo, String address){
        this.user_id = autoIncrementId++;
        this.name = name;
        this.password = password;
        this.phoneNo = phoneNo;
        this.Address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return  this.password;
    }

}
