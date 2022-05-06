package jpaqueriesexample.dao;

import java.util.List;

import jpaqueriesexample.entities.Book;

public interface BookDAO {
	
	public List<Book>  getBookByAuthor(String author);

}
