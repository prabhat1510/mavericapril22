package jpaqueriesexample.ui;

import jpaqueriesexample.service.BookService;
import jpaqueriesexample.service.BookServiceImpl;

public class BookMainApp {

	public static void main(String[] args) {
	BookService bookService = new BookServiceImpl();
	System.out.println(bookService.getBookByAuthor("Amish Trivedi"));

	}

}
