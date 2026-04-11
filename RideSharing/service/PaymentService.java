package RideSharing.service;

import RideSharing.model.ConfirmTrip;
import RideSharing.model.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {

    private List<Payment> payments = new ArrayList<>();

    public int calculateFare(int distance, int duration) {
        int baseFare = 50;
        int perKm = 10;
        int perMin = 2;

        return baseFare + (distance * perKm) + (duration * perMin);
    }

    public Payment createPayment(ConfirmTrip trip) {

        if (trip == null) {
            System.out.println("Invalid Trip!");
            return null;
        }

        int fare = calculateFare(trip.getDistance(), trip.getDuration());

        Payment payment = new Payment(trip, fare);
        payments.add(payment);

        System.out.println("Payment Created! Amount: " + fare);
        return payment;
    }

    public void completePayment(int paymentId) {
        Payment payment = findPaymentById(paymentId);

        if (payment != null) {
            payment.setPaymentStatus("PAID");
            System.out.println("Payment Successful!");
        } else {
            System.out.println("Payment not found!");
        }
    }

    public Payment findPaymentById(int id) {
        for (Payment p : payments) {
            if (p.getPaymentId() == id) {
                return p;
            }
        }
        return null;
    }

    public void displayPayments() {

        if (payments.isEmpty()) {
            System.out.println("No payments found!");
            return;
        }

        for (Payment p : payments) {
            System.out.println("--------------------------------");
            System.out.println("Payment ID: " + p.getPaymentId());
            System.out.println("Trip ID: " + p.getTrip().getTripId());
            System.out.println("Amount: " + p.getAmount());
            System.out.println("Status: " + p.getPaymentStatus());
        }
    }
}