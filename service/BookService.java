package service;

import java.util.List;

import model.Book;
import repository.BookRepo;

public class BookService {
    private BookRepo bookRepo;
    BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void addBook(String bookName, List<String> author) {
        bookRepo.addBook(bookName, author);
    }

    public void searchBook(String bookName) {
        Book book = bookRepo.searchBook(bookName);
        if(book == null) {
            System.out.println("No book present");
            return;
        }
        System.out.println("id : " + book.getId());
        System.out.println("name : " + book.getName());
        System.out.println("status : " + book.getStatus());
        
    }

    public void removeBook(String bookName) {
        bookRepo.removeBook(bookName);
    }

}
