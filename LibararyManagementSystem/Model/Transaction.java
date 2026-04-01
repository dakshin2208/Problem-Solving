package LibararyManagementSystem.Model;

import java.util.Date;

public class Transaction {
    private int transactionId;
    private User user;
    private Book book;
    private Date borrowDate;
    private Date returnDate;
    private long fair;
    private boolean isReturned;

    public Transaction(int transactionId, User user, Book book) {
        this.transactionId = transactionId;
        this.user = user;
        this.book = book;
        this.borrowDate = new Date();
        this.isReturned = false;
    }

    public int getTransactionId() { return transactionId; }
    public User getUser() { return user; }
    public Book getBook() { return book; }
    public long getFine() { return fair; }

    public Date getBorrowDate() { return borrowDate; }
    public Date getReturnDate() { return returnDate; }
    public boolean isReturned() { return isReturned; }

    public void markReturned() {
        this.isReturned = true;
        this.returnDate = new Date();
    }

    public long getFair(int days){
        return days * 20L;
    }

}


