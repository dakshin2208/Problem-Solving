package MedicineManagementSystem;

import MedicineManagementSystem.Controller.MedicineController;
import MedicineManagementSystem.Controller.UserController;
import MedicineManagementSystem.Model.Medicine;
import MedicineManagementSystem.Model.User;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static UserController userController = new UserController();
    static MedicineController medicineController = new MedicineController();
    public static void main(String[] args) {


        while(true){
            System.out.println("1.user registration");
            System.out.println("2.medicine add");
            System.out.println("3.display all user");
            int n = in.nextInt();
            in.nextLine();
            switch (n){
                case 1:
                    userRegistration();
                    break;
                case 2:
                    addMedicine();
                    break;
                case 3:
                    displayAllUser();
                    break;
                case 4:
                    purchase();
            }
        }


    }
    static public void userRegistration(){
        System.out.println("Enter the name");
        String name = in.nextLine();
        System.out.println("Enter the phone number");
        String phNo = in.nextLine();
        userController.addUser(name,phNo);
    }
    static public void addMedicine(){
        System.out.println("Enter the medicine name:");
        String name = in.nextLine();
        System.out.println("Enter quantity");
        int quantity = in.nextInt();
        System.out.println("Enter price");
        double price = in.nextDouble();
        medicineController.addMedicine(name,quantity,price);
    }
    static public void displayAllUser(){
        userController.getAllUsers();
    }

    static public void purchase(){
        System.out.println("Please select medicine:");
        medicineController.displayAllMedicine();
    }
}
