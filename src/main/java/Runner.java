import db.DBAuthor;
import models.Author;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Author author1 = new Author("Robert Galbraith", "The Cuckoo's Calling");
        DBAuthor.save(author1);

        Author author2 = new Author("JRR Tolkein", "The Lord of the Rings");
        DBAuthor.save(author2);

        DBAuthor.delete(author2);

        List<Author> authors = DBAuthor.getAuthors();

    }
}
