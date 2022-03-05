package service;

import java.util.HashMap;
import java.util.Map;

import model.Book;
import model.BookStatus;
import model.User;
import repository.BookRepo;
import repository.UserRepo;

public class BookIssueService {
    private UserRepo userRepo;
    private BookRepo bookRepo;
    private String issueDate;
    private String numberOfDays;
    public static final int MAX_FINE_DATE = 7;
    public static final int MAX_ISSUE_USER = 2;
    private Map<String, String> bookUserMap;

    
    public BookIssueService(UserRepo userRepo, BookRepo bookRepo) {
        this.userRepo = userRepo;
        this.bookRepo = bookRepo;
        this.bookUserMap = new HashMap<String, String>();
    }

    public void issueBookToUser(String userName, String bookName, String issueDate, String numberOfDays) {
        //if user is not present
        Book book = bookRepo.searchBook(bookName);
        if(book.getStatus() == BookStatus.AVAILABLE) {
            User user = userRepo.getUser(userName);
            int bookPresent = user.getBooksPresent();
            if(bookPresent >= 2) {
                System.out.println("user can't take more books");
                return;
            }
            user.setBooksPresent(user.getBooksPresent() + 1);
            bookUserMap.put(bookName, userName);
            book.setStatus(BookStatus.BOOKED);
            this.issueDate = issueDate;
            this.numberOfDays = numberOfDays;
        }
            
        
    }

    public void returnBook(String userName, String bookName, String returnDate) {
        bookUserMap.remove(bookName);
        Book book = bookRepo.searchBook(bookName);
        book.setStatus(BookStatus.AVAILABLE);


    }
    
    public void checkLateFine(String userName, String bookName, String currentDate) {


    }
}
