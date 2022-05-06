package jpaqueriesexample.service;

import java.util.List;

import jpaqueriesexample.dao.BookDAO;
import jpaqueriesexample.dao.BookDAOImpl;
import jpaqueriesexample.entities.Book;

public class BookServiceImpl implements BookService {
	private BookDAO bookDao = new BookDAOImpl();

	@Override
	public List<Book>  getBookByAuthor(String author) {

		return bookDao.getBookByAuthor(author);
	}

}
