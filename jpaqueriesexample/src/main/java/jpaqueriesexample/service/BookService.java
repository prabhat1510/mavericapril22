package jpaqueriesexample.service;

import java.util.List;

import jpaqueriesexample.entities.Book;

public interface BookService {
	public List<Book>  getBookByAuthor(String author);
}
