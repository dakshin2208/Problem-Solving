package MedicineManagementSystem.Repository;

import MedicineManagementSystem.Model.User;

import java.util.ArrayList;

public class UserRepository {
    //so called user database
    private ArrayList<User> userDb = new ArrayList<>();

    public String saveUser(User user){
        userDb.add(user);
        return "User Added SuccessFully";
    }
    public ArrayList<User> allUser(){
        return userDb;
    }
}
