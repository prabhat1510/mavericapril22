package jpaqueriesexample.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jpaqueriesexample.entities.Book;

public class BookDAOImpl implements BookDAO {

	@Override
	public Book getBookByAuthor(String author) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaqueriesexample");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b WHERE b.author = :author",Book.class);
		query.setParameter("author", author);
		Book books = query.getSingleResult();
		em.getTransaction().commit();
		return books;
	}

}
