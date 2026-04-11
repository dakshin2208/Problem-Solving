package RideSharing.model;

public class Users {
    private int userID;
    private static int u = 0;
    private String name;
    private String email;
    private String phoneNo;
    private String address;

    public Users(String name, String email, String phoneNo, String address) {
        this.userID = ++u;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public int getUserId() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }
}