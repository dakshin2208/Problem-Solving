package RideSharing.model;

public class Payment {

    private int paymentId;
    private static int p = 0;

    private ConfirmTrip trip;
    private int amount;
    private String paymentStatus;

    public Payment(ConfirmTrip trip, int amount) {
        this.paymentId = ++p;
        this.trip = trip;
        this.amount = amount;
        this.paymentStatus = "PENDING";
    }

    public int getPaymentId() {
        return paymentId;
    }

    public ConfirmTrip getTrip() {
        return trip;
    }

    public int getAmount() {
        return amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }
}