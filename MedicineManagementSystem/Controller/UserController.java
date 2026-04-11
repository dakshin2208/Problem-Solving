package MedicineManagementSystem.Controller;

import MedicineManagementSystem.Model.User;
import MedicineManagementSystem.Service.UserService;
import MedicineManagementSystem.Service.UserServiceImpl;

import java.util.ArrayList;

public class UserController {
    UserService userService;
    private int userId;

    public UserController(){
        userService  = new UserServiceImpl();
    }

    public void addUser(String name , String phoneNo){
        userId = userId++;
        User user = new User(userId , name , phoneNo);
        userService.addUser(user);
        System.out.println("User added SuccessFully...!");
    }

    public void getAllUsers(){
        userService.allUser();
    }
}
