package jpaqueriesexample.service;

import java.util.List;

import jpaqueriesexample.entities.Book;

public interface BookService {
	public Book  getBookByAuthor(String author);
}
