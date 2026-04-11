package RideSharingPlatform.AppStart;

import RideSharingPlatform.Controller.DriverController;
import RideSharingPlatform.Controller.RideController;
import RideSharingPlatform.Controller.UserController;
import RideSharingPlatform.Model.User;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static UserController userController = new UserController();
    static DriverController driverController = new DriverController();
    static RideController rideController = new RideController();
    public static void main(String[] args) {

        while(true){
            System.out.println("1.Add user");
            System.out.println("2.Add Driver");
            System.out.println("3.book ride");
            int n = in.nextInt();
            in.nextLine();
            switch (n){
                case 1:
                    addUser();
                    break;
                case 2:
                    addDriver();
                    break;
                case 3:
                    bookRide();
                    break;
            }

        }
    }
    static void addUser(){
        System.out.println("Enter the name :");
        String name = in.nextLine();
        System.out.println("enter the phoneNo:");
        String phoneNo = in.nextLine();
        userController.AddUser(name,phoneNo);
    }
    static void addDriver(){

    }

    static void bookRide(){

    }
}

