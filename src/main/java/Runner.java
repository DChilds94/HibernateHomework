
import db.DBHelper;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Author author1 = new Author("Robert Galbraith");
        DBHelper.save(author1);

        Author author2 = new Author("JRR Tolkien");
        DBHelper.save(author2);

        author2.setName("Frodo Baggins");
        DBHelper.save(author2);

        Author foundAuthor = DBHelper.find(Author.class, author2.getId());






        List<Author> authors = DBHelper.getAll(Author.class);

        Book book1 = new Book("The Cuckoo's Calling", author1);
        DBHelper.save(book1);

        Book book2 = new Book("The Lord of the Rings", author2);
        DBHelper.save(book2);

        Book foundBook = DBHelper.find(Book.class, book2.getId());



        book1.setTitle("The Silkworm");
        DBHelper.save(book1);

        List<Book> books = DBHelper.getAll(Book.class);

        DBHelper.delete(book2);

        DBHelper.delete(author2);




    }
}
