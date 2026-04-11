package RideSharingPlatform.Controller;

import RideSharingPlatform.Serivce.UserService;
import RideSharingPlatform.Serivce.UserServiceImpl;

public class UserController {
    UserService userService;

    public UserController(){
        userService = new UserServiceImpl();
    }

    public void AddUser(String name , String phone_no){
        userService.addUser(name , phone_no);
    }
}
