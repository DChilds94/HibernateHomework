package models;

import java.util.ArrayList;

public class Author {

    private String name;
    private String book;
    private int id;

    public Author(String name, String book) {
        this.name = name;
        this.book = book;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
