package models;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
    private String title;
    private Author author;
    private int id;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @ManyToOne
    @JoinColumn(name="author_id", nullable = false)
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
