package LibararyManagementSystem.Controller;

import LibararyManagementSystem.Model.Book;
import LibararyManagementSystem.Service.LibraryService;

import java.util.ArrayList;

public class BookController {
    LibraryService libraryService;

    public ArrayList<Book> searchBook(){
        ArrayList<Book> books = libraryService.searchBooks();
        return books;
    }
}
