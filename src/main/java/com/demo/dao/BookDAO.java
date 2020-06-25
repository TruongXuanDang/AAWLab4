package com.demo.dao;

import com.demo.entity.Book;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Stateless
public class BookDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public BookDAO() {
    }

    public void insertBook(Book p)
    {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }

    public void updateBook(int id)
    {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Book p = em.find(Book.class, id);
        p.setBookName("IPhone 5 updated");
        em.getTransaction().commit();
        em.close();
    }

    public void deleteBook(int id)
    {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Book p = em.find(Book.class, id);
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    public List<Book> getBook()
    {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Book> list = em.createQuery("SELECT c from Book c", Book.class).getResultList();

        em.getTransaction().commit();
        em.close();
        return list;
    }

    public Book getDetailBook(int id)
    {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Book product = em.find(Book.class, id);
        em.getTransaction().commit();
        em.close();
        return product;
    }
}
