package UberManagementSystem.Service;

import UberManagementSystem.Model.Ride;

public interface RideService {
    Ride createRide(int userId, String pickup, String drop);
    void assignDriver(int rideId, int driverId);
    double calculateFare(String pickup, String drop);
    void completeRide(int rideId);
}
