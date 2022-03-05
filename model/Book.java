package model;

import java.util.List;
import java.util.UUID;

public class Book {
    
    private String id;
    private String name;
    //private List<Author> authors;
    private List<String> authors;
    private BookStatus status;
    private Double rating;

    public Book(String bookName, List<String> authors) {
        this.id = UUID.randomUUID().toString();
        this.name = bookName;
        this.authors = authors;
        this.status = BookStatus.AVAILABLE;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public BookStatus getStatus() {
        return status;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

}
