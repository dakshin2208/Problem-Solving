package LldPractice;

import LldPractice.Controller.UserController;
import LldPractice.Service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the userName :");
        String name = in.nextLine();
        System.out.println("Enter the password:");
        String password = in.nextLine();
        String result = userController.login(name , password);
        System.out.println(result);
    }
}
