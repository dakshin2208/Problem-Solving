package RideSharingPlatform.Serivce;

import RideSharingPlatform.Model.User;
import RideSharingPlatform.Repository.UserRepository;

public class UserServiceImpl implements UserService{
    UserRepository userRepository ;
    User user ;
    private int userId = 0;

    public UserServiceImpl(){
        this.userRepository = new UserRepository();
    }

    @Override
    public void addUser(String userName, String phoNo) {
        user = new User(userId++,userName , phoNo);
        if(userRepository.addUser(user)){
            System.out.println("User Added SuccessFully...!");
        }else{
            System.out.println("User already exits ... !");
        }
    }
}
