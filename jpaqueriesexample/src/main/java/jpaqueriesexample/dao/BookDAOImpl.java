package jpaqueriesexample.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jpaqueriesexample.entities.Book;

public class BookDAOImpl implements BookDAO {

	@Override
	public List<Book> getBookByAuthor(String author) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaqueriesexample");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Book>  query =(TypedQuery<Book>) em.createQuery("SELECT book.id FROM Book book WHERE book.author = ? ;");
		query.setParameter(1, author);
		List<Book> books = query.getResultList();
		em.getTransaction().commit();
		return books;
	}

}
