package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="authors")
public class Author {

    private String name;
    private Set<Book> books;
    private int id;

    public Author(String name) {
        this.name = name;

    }

    public Author() {
    }
    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @OneToMany(mappedBy = "author")
    public Set<Book> getBooks() {
        return books ;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
