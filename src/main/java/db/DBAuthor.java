package db;

import models.Author;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DBAuthor {
    private static Session session;
    private static Transaction transaction;

    public static void save(Author author){
        session = HibernateUtil.getSessionfactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(author);
            transaction.commit();
        } catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static List<Author> getAuthors(){
        session = HibernateUtil.getSessionfactory().openSession();
        List<Author> results = null;
        try{
            String hql = "from Author";
            results = session.createQuery(hql).list();
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static void delete(Author author){
        session = HibernateUtil.getSessionfactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(author);
            transaction.commit();
        } catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void update(Author author){
        session = HibernateUtil.getSessionfactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.update(author);
            transaction.commit();
        } catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
