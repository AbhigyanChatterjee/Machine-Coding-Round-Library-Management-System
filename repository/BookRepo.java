package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Book;

public class BookRepo {
    private Map<String, Book> allBooks;
    private Map<String, List<Book>> allBookByUser;
    
    private static BookRepo bookRepo = new BookRepo();
    
    
    private BookRepo() {
        allBooks = new HashMap<String, Book>();
    }

    public static BookRepo makeBookRepo(){
        return bookRepo;
    }
    
    public void addBook(String bookName,List<String> authors) {
        // if already book exists
        //else if book don't exist
        if(!allBooks.containsKey(bookName)) {
            Book newBook = new Book(bookName, authors);
            allBooks.put(bookName,newBook);
        }
        else {
            System.out.println("Book already exists");
        }
    }

    public Book removeBook(String bookName) {
        if(!allBooks.containsKey(bookName)) {
            System.out.println("The book isn't present to be removed");
            return null;
        }
        else {
            Book removedBook = allBooks.remove(bookName);
            System.out.println("Book is removed");
            return removedBook;
        }
    }

    public Book searchBook(String bookName) {
        if(allBooks.containsKey(bookName)) {
            Book book =allBooks.get(bookName);
            System.out.println("Book is found");
            return book;
        }
        else {
            System.out.println("Book with book name is not present to be searched");
            return null;
        }
    }



}
