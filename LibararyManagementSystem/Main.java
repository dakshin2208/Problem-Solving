package LibararyManagementSystem;

import LibararyManagementSystem.Controller.BookController;
import LibararyManagementSystem.Model.Book;
import LibararyManagementSystem.Service.LibraryService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BookController bookController;

       System.out.println("Welcome ... !");
       while(true){
           System.out.println("1.Borrow the books");
           System.out.println("2.Search the books");
           System.out.println("3.Return the book");
           System.out.println("4.Exit");
           System.out.println("enter the choice..");
           int n = in.nextInt();
           switch (n){
               case 1:
                   System.out.println("working..");
                   break;
               case 2:

           }
       }
    }

}
