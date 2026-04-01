package UberManagementSystem.AppStart;

import UberManagementSystem.Controller.PaymentController;
import UberManagementSystem.Controller.RideController;
import UberManagementSystem.Model.Ride;
import UberManagementSystem.Repository.DriverRepository;
import UberManagementSystem.Repository.PaymentRepository;
import UberManagementSystem.Repository.RideRepository;
import UberManagementSystem.Service.PaymentService;
import UberManagementSystem.Service.RideServiceImpl;
import UberManagementSystem.Utils.Strategy.FareStrategy;
import UberManagementSystem.Utils.Strategy.PremiumFare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DriverRepository driverRepository = new DriverRepository();
        PaymentRepository paymentRepository = new PaymentRepository();
        RideRepository rideRepository = new RideRepository();
        FareStrategy fare = new PremiumFare();
        RideServiceImpl rideService = new RideServiceImpl(rideRepository, driverRepository, fare);
        RideController rideController = new RideController(rideService);
        PaymentService paymentService = new PaymentService(paymentRepository);


        while (true) {
            System.out.println("Welcome.....!");
            System.out.println("1.Book ride");
            System.out.println("2.exit");
            int n = in.nextInt();
            in.nextLine();
            switch (n) {
                case 1:
                    System.out.println("Enter the pickup location : ");
                    String pickup = in.nextLine();
                    System.out.println("Enter the destination location :");
                    String destination = in.nextLine();
                    Ride ride = rideController.requestRide(1, pickup, destination);
                    System.out.println("Driver Assigned Successfully for this ride.");
                    rideController.acceptRide(ride.id, 1);
                    double fair = rideController.getFare(pickup, destination);
                    System.out.println("Need to pay : " + fair);
                    System.out.println("Complete the payment Process to complete the transaction....!");
                    String amount = in.nextLine();
                    PaymentController paymentController = new PaymentController(paymentService);
                    paymentController.pay(ride.id, fair);
                    System.out.println("payment processed successfully .... !");
                    System.out.println("RideCompleting process is started .");
                    rideController.completeRide(ride.id);
                    System.out.println("Ride completed SuccessFully");
                    break;
                case 2:
                    return;


            }
        }
    }
}
