package MedicineManagementSystem.Service;

import MedicineManagementSystem.Model.User;

import java.util.ArrayList;

public interface UserService {
    public String addUser(User user);

    public ArrayList<User> allUser();
}
