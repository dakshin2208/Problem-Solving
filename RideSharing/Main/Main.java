package RideSharing.Main;

import java.util.*;
import RideSharing.service.*;
import RideSharing.model.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static UserService us = new UserService();
    static RideRequestService rs = new RideRequestService();
    static RideService ris = new RideService();
    static CancellationService cs = new CancellationService();
    static PaymentService ps = new PaymentService();
    static RatingService rate = new RatingService();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Register Driver");
            System.out.println("2. Register Passenger");
            System.out.println("3. Create Ride Request");
            System.out.println("4. Accept Ride");
            System.out.println("5. Confirm Trip");
            System.out.println("6. Cancel Trip");
            System.out.println("7. Start Trip");
            System.out.println("8. End Trip");
            System.out.println("9. Payment");
            System.out.println("10. Rating");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    registerDriver();
                    break;
                case 2:
                    registerPassenger();
                    break;
                case 3:
                    requestRide();
                    break;
                case 4:
                    acceptRide();
                    break;
                case 5:
                    confirmTrip();
                    break;
                case 6:
                    cancelTrip();
                    break;
                case 7:
                    startTrip();
                    break;
                case 8:
                    endTrip();
                    break;
                case 9:
                    createPayment();
                    break;
                case 10:
                    giveRatings();
                    break;
                case 11:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void registerDriver() {
        sc.nextLine(); 

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        System.out.println("Enter Phone:");
        String phone = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter Current Location:");
        String location = sc.nextLine();

        Driver d = new Driver(name, email, phone, address, location);
        us.addDriver(d);

        System.out.println("Driver Registered Successfully!");
    }

    public static void registerPassenger() {
        sc.nextLine(); 
        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        System.out.println("Enter Phone:");
        String phone = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter Source:");
        String source = sc.nextLine();

        System.out.println("Enter Destination:");
        String destination = sc.nextLine();

        Passenger p = new Passenger(name, email, phone, address, source, destination);
        us.addPassenger(p);

        System.out.println("Passenger Registered Successfully!");
    }

    public static void requestRide() {

        System.out.println("Enter Passenger ID:");
        int pid = sc.nextInt();

        System.out.println("Enter Driver ID:");
        int did = sc.nextInt();

        Passenger passenger = us.getPassengerById(pid);
        Driver driver = us.getDriverById(did);

        if (passenger == null || driver == null) {
            System.out.println("Invalid IDs!");
            return;
        }

        rs.createRequest(driver, passenger);
    }

    public static void acceptRide() {
        System.out.println("Enter Request ID:");
        int reqId = sc.nextInt();

        rs.acceptRide(reqId);
    }
    public static void confirmTrip() {

        System.out.println("Enter Request ID:");
        int reqId = sc.nextInt();

        RideRequest request = rs.findRequestById(reqId);

        if (request == null || !request.getstatus().equals("ACCEPTED")) {
            System.out.println("Ride not accepted yet!");
            return;
        }

        System.out.println("Enter Distance:");
        int distance = sc.nextInt();

        System.out.println("Enter Duration:");
        int duration = sc.nextInt();

        ris.confirmTrip(
                request.getpassenger(),
                request.getdriver(),
                distance,
                duration
        );
    }

    public static void cancelTrip() {

        System.out.println("Enter Request ID:");
        int reqId = sc.nextInt();
        sc.nextLine();

        RideRequest request = rs.findRequestById(reqId);

        if (request == null) {
            System.out.println("Request not found!");
            return;
        }

        System.out.println("Enter User ID:");
        int userId = sc.nextInt();
        sc.nextLine();

        Users user = us.findUserById(userId);

        System.out.println("Enter Date:");
        String date = sc.nextLine();

        System.out.println("Enter Reason:");
        String reason = sc.nextLine();

        cs.cancelRide(request, user, date, reason);
    }

    public static void createPayment() {

        System.out.println("Enter Trip ID:");
        int tripId = sc.nextInt();

        ConfirmTrip trip = ris.findTripById(tripId);

        if (trip == null || !trip.getTripStatus().equals("COMPLETED")) {
            System.out.println("Trip not completed!");
            return;
        }

        Payment payment = ps.createPayment(trip);

        System.out.println("Enter Payment ID to pay:");
        int payId = sc.nextInt();

        ps.completePayment(payId);
    }

    public static void giveRatings() {

        System.out.println("Enter Trip ID:");
        int tripId = sc.nextInt();
        sc.nextLine();

        ConfirmTrip trip = ris.findTripById(tripId);

        if (trip == null) {
            System.out.println("Trip not found!");
            return;
        }

        System.out.println("Enter Rating (1-5):");
        int rating = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Feedback:");
        String feedback = sc.nextLine();

        rate.addRating(trip, rating, feedback);
    }
    public static void startTrip() {
        System.out.println("Enter Trip ID:");
        int tripId = sc.nextInt();
        ris.startTrip(tripId);
    }

    public static void endTrip() {
        System.out.println("Enter Trip ID:");
        int tripId = sc.nextInt();

        ris.endTrip(tripId);
    }
}