package ZomatoManagementSystem.Model;

import java.util.List;

public class User {
    public int user_id;
    public String name;
    public String phone;

    public List<Order> orders;
    public List<String> address;

}
