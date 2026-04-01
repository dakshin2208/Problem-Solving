package LldPractice.Repository;

import LldPractice.Model.User;

import java.util.ArrayList;
import java.util.HashMap;

public class UserRepository {

    private HashMap<String ,User> userRepository = new HashMap<>();

    public void save(User user){
        userRepository.put(user.getName() , user);
    }

    public User findByUserName(String username){
        return userRepository.get(username);
    }


}
