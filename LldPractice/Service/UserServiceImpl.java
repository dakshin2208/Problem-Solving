package LldPractice.Service;

import LldPractice.Model.User;
import LldPractice.Repository.UserRepository;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    public UserServiceImpl(){
        this.userRepository = new UserRepository();
        userRepository.save(new User("dakshin" , "dakshin@123" , "989898899382" , "TN"));
    }
    @Override
    public String login(String username, String password) {
        User user = userRepository.findByUserName(username);

        if(user == null){
            return "user not found";
        }

        if(user.getPassword().equals(password)){
            return "login successfully";
        }else{
            return "Invalid password";
        }
    }
}
