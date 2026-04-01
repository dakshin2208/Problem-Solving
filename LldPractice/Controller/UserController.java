package LldPractice.Controller;

import LldPractice.Model.User;
import LldPractice.Service.UserService;
import LldPractice.Service.UserServiceImpl;

public class UserController {
    UserService userService;

    public UserController(){
        this.userService = new UserServiceImpl();
    }

    public String login(String username , String password){
        return userService.login(username,password);
    }
}
