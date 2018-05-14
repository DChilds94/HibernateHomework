package db;

import models.Author;
import models.Book;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DBBook {

    private static Session session;
    private static Transaction transaction;


    public static void save(Book book){
        session = HibernateUtil.getSessionfactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        } catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

}
