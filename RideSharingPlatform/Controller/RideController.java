package RideSharingPlatform.Controller;

import RideSharingPlatform.Serivce.RideService;
import RideSharingPlatform.Serivce.RideServiceImpl;

public class RideController {
    RideService rideService ;

    public RideController(){
        rideService = new RideServiceImpl();
    }


}
