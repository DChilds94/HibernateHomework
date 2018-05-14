package db;

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

    public static List<Book> getBooks(){
        session = HibernateUtil.getSessionfactory().openSession();
        List<Book> results = null;
        try{
            String hql = "from Book";
            results = session.createQuery(hql).list();
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static void delete(Book book){
        session = HibernateUtil.getSessionfactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(book);
            transaction.commit();
        } catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void update(Book book){
        session = HibernateUtil.getSessionfactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.update(book);
            transaction.commit();
        } catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

}
