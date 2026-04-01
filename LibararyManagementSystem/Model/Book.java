package LibararyManagementSystem.Model;

public class Book {
    private int bookId;
    private String title;
    private boolean isAvailable;
    public Book(){}
    public Book(int bookId, String title, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public int getBookId() {
        return this.bookId;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void markBorrowed() {
        this.isAvailable = false;
    }

    public void markReturned() {
        this.isAvailable = true;
    }
}