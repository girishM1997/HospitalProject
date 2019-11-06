package com.training;

public class Book {

	public static final double discount=0.2;
	
	private long bookId;
	private String bookName;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(long bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	
}
