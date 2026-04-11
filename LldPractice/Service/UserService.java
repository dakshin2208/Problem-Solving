package LldPractice.Service;

import LldPractice.Model.User;

import java.util.HashMap;

public interface UserService {
    public String login(String username , String password);

    public String signup(String username , String password, String phone , String address);

    public HashMap<String , User> db();
}
