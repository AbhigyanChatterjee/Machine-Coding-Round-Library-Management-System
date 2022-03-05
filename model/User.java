package model;

import java.util.UUID;

public class User {
    private String id;
    private String username;
    private ContactInfo contact;
    private int booksPresent;

    public User(String username) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
        this.booksPresent = 0;
    }


    public String getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public ContactInfo getContact() {
        return contact;
    }


    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }


    public void setId(String id) {
        this.id = id;
    }


    public int getBooksPresent() {
        return booksPresent;
    }


    public void setBooksPresent(int booksPresent) {
        this.booksPresent = booksPresent;
    }

    

}
