package LibararyManagementSystem.Service;

import LibararyManagementSystem.Model.Book;
import LibararyManagementSystem.Model.Transaction;
import LibararyManagementSystem.Model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService{
    Scanner in = new Scanner(System.in);

    private long amount = 0;
    ArrayList<Book> allbooks = new ArrayList<>();


    @Override
    public void borrowBook(User user , Book book) {
        if(!book.isAvailable()){
            System.out.println("Book not Available...!");
            return;
        }
        book.markBorrowed();
        Transaction transaction = new Transaction(1 , user , book);

        System.out.println("Book borrowed successfully");
    }

    @Override
    public void returnBook(User user, Book book) {
        if(!book.isAvailable()){
            System.out.println("Book is Not Borrowed");
            return;
        }

        book.markReturned();

        System.out.println("Returned successfully");
    }

    @Override
    public void payment(User user, Book book, Transaction transaction ) {
        System.out.println("The amount should pay :" );
        System.out.println("Enter the days : ");
        int days = in.nextInt();
        System.out.println(transaction.getFair(days));
        System.out.println("please pay the amount:");
        int amounts = in.nextInt();
        if(amount == transaction.getFair(days)){
            amount += amounts;
            System.out.println("Transaction SuccessFully Completed");
        }
    }

    @Override
    public ArrayList<Book> searchBooks() {
        return allbooks;
    }

    public long getTotalAmount(){
        return amount;
    }



}
