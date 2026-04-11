package LldPractice.Controller;

import LldPractice.Model.User;
import LldPractice.Service.UserService;
import LldPractice.Service.UserServiceImpl;

import java.util.HashMap;

public class UserController {
    UserService userService;

    public UserController(){
        this.userService = new UserServiceImpl();
    }

    public String login(String username , String password){
        return userService.login(username,password);
    }
    public String signup(String name , String password , String phone , String address){
        return userService.signup(name, password , phone , address);
    }
    public HashMap<String ,User> display(){
        return userService.db();
    }
}
