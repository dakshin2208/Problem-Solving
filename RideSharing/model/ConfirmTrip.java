package RideSharing.model;

public class ConfirmTrip {

    private int tripID;
    private static int t = 0;

    private int distance;
    private int duration;
    private String tripStatus;

    private Passenger passenger;
    private Driver driver;

    public ConfirmTrip(Passenger passenger, Driver driver, int distance, int duration) {
        this.tripID = ++t;
        this.passenger = passenger;
        this.driver = driver;
        this.distance = distance;
        this.duration = duration;
        this.tripStatus = "CREATED"; // default status
    }

    public int getTripId() {
        return tripID;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    public String getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(String tripStatus) {
        this.tripStatus = tripStatus;
    }
}