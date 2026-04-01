package ZomatoManagementSystem.Model;
import java.util.List;

public class DeliveryPartner {
    int partner_id;
    boolean isAvailable;
    String phone_no;
    String name;

    String currentLocation;

    List<Order> order;

}
