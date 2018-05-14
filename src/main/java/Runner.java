import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Author author1 = new Author("Robert Galbraith", "The Cuckoo's Calling");
        DBAuthor.save(author1);

        Author author2 = new Author("JRR Tolkien", "The Lord of the Rings");
        DBAuthor.save(author2);

        author2.setName("Frodo Baggins");
        DBAuthor.update(author2);

        Author foundAuthor = DBAuthor.find(author2.getId());

        DBAuthor.delete(author2);




        List<Author> authors = DBAuthor.getAuthors();

        Book book1 = new Book("The Cuckoo's Calling", "Robert Galbraith");
        DBBook.save(book1);

        Book book2 = new Book("The Lord of the Rings", "JRR Tolkien");
        DBBook.save(book2);

        Book foundBook = DBBook.find(book2.getId());

        DBBook.delete(book2);

        book1.setTitle("The Silkworm");
        DBBook.update(book1);

        List<Book> books = DBBook.getBooks();






    }
}
