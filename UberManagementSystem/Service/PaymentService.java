package UberManagementSystem.Service;

import UberManagementSystem.Model.Payment;
import UberManagementSystem.Repository.PaymentRepository;

public class PaymentService {

    private PaymentRepository repo;

    public PaymentService(PaymentRepository repo) {
        this.repo = repo;
    }

    public void pay(int rideId, double amount) {
        Payment p = new Payment();
        p.rideId = rideId;
        p.amount = amount;
        p.status = "SUCCESS";

        repo.save(p);
    }
}
