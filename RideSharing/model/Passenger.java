package RideSharing.model;

public class Passenger extends Users {

    private String source;
    private String destination;

    public Passenger(String name, String email, String phoneNo, String address, String source, String destination) {
        super(name, email, phoneNo, address);
        this.source = source;
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
}