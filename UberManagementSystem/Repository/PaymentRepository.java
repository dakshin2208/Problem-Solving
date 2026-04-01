package UberManagementSystem.Repository;

import UberManagementSystem.Model.Payment;

import java.util.HashMap;

public class PaymentRepository {
    private HashMap<Integer , Payment> map = new HashMap<>();

    private int id = 1;

    public void save(Payment payment){
        payment.id = id++;
        map.put(payment.id, payment);
    }
}
