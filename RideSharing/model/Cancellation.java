package RideSharing.model;

public class Cancellation {

    private int cancelId;
    private static int c = 0;

    private RideRequest ride;
    private Users user;
    private String cancelledOn;
    private String reason;

    public Cancellation(RideRequest ride, Users user, String cancelledOn, String reason) {
        this.cancelId = ++c;
        this.ride = ride;
        this.user = user;
        this.cancelledOn = cancelledOn;
        this.reason = reason;
    }

    public int getCancelId() {
        return cancelId;
    }

    public RideRequest getRide() {
        return ride;
    }

    public Users getUser() {
        return user;
    }

    public String getCancelledOn() {
        return cancelledOn;
    }

    public String getReason() {
        return reason;
    }
}