package LibararyManagementSystem.Service;

import LibararyManagementSystem.Model.Book;
import LibararyManagementSystem.Model.Transaction;
import LibararyManagementSystem.Model.User;

import java.util.ArrayList;

public interface LibraryService {

    void borrowBook(User user , Book book);

    void returnBook(User user ,Book book);

    void payment(User user , Book book , Transaction transaction);

    ArrayList<Book> searchBooks();
}
