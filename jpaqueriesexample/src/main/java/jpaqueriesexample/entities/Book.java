package jpaqueriesexample.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="book_info")
public class Book {
	
	private Long id;
	private String bookTitle;
	private String author;
	private Double price;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(Long id, String bookTitle, String author, Double price) {
		this.id = id;
		this.bookTitle = bookTitle;
		this.author = author;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookTitle=" + bookTitle + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}
