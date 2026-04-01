package UberManagementSystem.Service;

import UberManagementSystem.Exception.DriverNotAvailableException;
import UberManagementSystem.Model.Driver;
import UberManagementSystem.Model.Ride;
import UberManagementSystem.Model.RideStatus;
import UberManagementSystem.Repository.DriverRepository;
import UberManagementSystem.Repository.RideRepository;
import UberManagementSystem.Utils.Strategy.FareStrategy;

public class RideServiceImpl implements RideService {

    private RideRepository rideRepo;
    private DriverRepository driverRepo;
    private FareStrategy fareStrategy;


    public RideServiceImpl(RideRepository rideRepo,
                           DriverRepository driverRepo,
                           FareStrategy fareStrategy) {
        this.rideRepo = rideRepo;
        this.driverRepo = driverRepo;
        this.fareStrategy = fareStrategy;
    }

    public Ride createRide(int userId, String pickup, String drop) {
        Ride ride = new Ride();
        ride.userId = userId;
        ride.pickup = pickup;
        ride.drop = drop;
        ride.status = RideStatus.REQUESTED;

        return rideRepo.save(ride);
    }

    public void assignDriver(int rideId, int driverId) {
        Ride ride = rideRepo.findById(rideId);
        Driver driver = driverRepo.findById(driverId);

        if (driver == null || !driver.isAvailable) {
            throw new DriverNotAvailableException("Driver not available");
        }

        ride.driverId = driverId;
        ride.status = RideStatus.ACCEPTED;
        driver.isAvailable = false;

        rideRepo.update(ride);
        driverRepo.update(driver);
    }

    public double calculateFare(String pickup, String drop) {
        return fareStrategy.calculateFare(pickup, drop);
    }

    public void completeRide(int rideId) {
        Ride ride = rideRepo.findById(rideId);
        ride.status = RideStatus.COMPLETED;
        rideRepo.update(ride);
    }
}
