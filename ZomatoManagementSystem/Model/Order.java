package ZomatoManagementSystem.Model;



import java.util.List;

public class Order {
    int Order_id;

   User user;
    Restaurant restaurant;
    DeliveryPartner deliveryPartner;

    List<OrderItem> itemList;
    double totalAmount;
    String OrderStatus;

    long createdAt;
    long deliveredAt;
}
