package UberManagementSystem.Controller;

import UberManagementSystem.Model.Ride;
import UberManagementSystem.Service.RideService;

public class RideController {

    private RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    public Ride requestRide(int userId, String pickup, String drop) {
        return rideService.createRide(userId, pickup, drop);
    }

    public void acceptRide(int rideId, int driverId) {
        rideService.assignDriver(rideId, driverId);
    }

    public double getFare(String pickup, String drop) {
        return rideService.calculateFare(pickup, drop);
    }

    public void completeRide(int rideId) {
        rideService.completeRide(rideId);
    }
}
