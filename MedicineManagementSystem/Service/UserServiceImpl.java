package MedicineManagementSystem.Service;

import MedicineManagementSystem.Model.User;
import MedicineManagementSystem.Repository.UserRepository;

import java.util.ArrayList;

public class UserServiceImpl implements UserService{
    UserRepository userRepository;
    public UserServiceImpl(){
        userRepository = new UserRepository();
    }
    @Override
    public String addUser(User users) {
        return userRepository.saveUser(users);
    }

    @Override
    public ArrayList<User> allUser() {
        ArrayList<User> user = userRepository.allUser();
        for(User u : user){
            System.out.println(u.getUserName());
            System.out.println(u.getPhNo());
        }
        return user;
    }
}
