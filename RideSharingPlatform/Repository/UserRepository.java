package RideSharingPlatform.Repository;

import RideSharingPlatform.Model.User;

import java.util.ArrayList;

public class UserRepository {
    private ArrayList<User> userRepositories = new ArrayList<>();

    public UserRepository(){}

    public boolean addUser(User user){
        for(User us : userRepositories){
            if(us.getUserName().equals(user)){
                return false;
            }
        }
        userRepositories.add(user);

        return true;
    }
}
