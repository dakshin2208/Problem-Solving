package LldPractice;

import LldPractice.Controller.UserController;
import LldPractice.Model.User;
import LldPractice.Service.UserService;
import LldPractice.Service.UserServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static UserController userController = new UserController();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("Welcome Sanjaya...!");
            System.out.println("Please pick choice :");
            System.out.println("1.signUp");
            System.out.println("2.logIn");

            int choice = in.nextInt();
            in.nextLine();
            switch (choice){
                case 1:
                    signup();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    HashMap<String , User> u = userController.display();
                    for(Map.Entry<String , User> entry : u.entrySet()){
                        User value = entry.getValue();
                        System.out.println(value.getName());
                    }
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void login(){
        String name = in.nextLine();
        String pass = in.nextLine();
        System.out.println(userController.login(name ,pass));
    }

    public static void signup(){
        System.out.println("Welcome to singUp page");
        System.out.println("Enter name:");
        String name = in.nextLine();
        System.out.println("password");
        String password = in.nextLine();
        System.out.println("phone no:");
        String phone_no = in.nextLine();
        System.out.println("address");
        String Address = in.nextLine();
        System.out.println(userController.signup(name , password , phone_no , Address));

    }

}
