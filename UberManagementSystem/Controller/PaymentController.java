package UberManagementSystem.Controller;

import UberManagementSystem.Service.PaymentService;

public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void pay(int rideId, double amount) {
        paymentService.pay(rideId, amount);
    }
}
