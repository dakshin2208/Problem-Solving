package RideSharing.model;

public class Driver extends Users {

    private String currentLocation;

    public Driver(String name, String email, String phoneNo, String address, String currentLocation) {
        super(name, email, phoneNo, address);
        this.currentLocation = currentLocation;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }
}