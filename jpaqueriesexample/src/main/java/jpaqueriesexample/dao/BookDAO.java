package jpaqueriesexample.dao;

import java.util.List;

import jpaqueriesexample.entities.Book;

public interface BookDAO {
	
	public Book  getBookByAuthor(String author);

}
