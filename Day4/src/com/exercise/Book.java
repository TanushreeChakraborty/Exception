package com.exercise;

import com.trainee.exceptions.RangeCheckException;

public class Book {
	
	private int bookId;
	private String bookName;
	private String auther;
	private double price;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(int bookId, String bookName, String auther, double price)throws RangeCheckException {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.auther = auther;
		
		if(this.price<100||this.price>500)
		{
			throw new RangeCheckException("Invalid");
		}else {
		this.price = price;
		}
	}
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
	
		try {
			this.bookId = bookId;
		} catch (NullPointerException e) {
			System.err.println("Null pointer exception");
			// TODO: handle exception
		}
		
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		if(bookName!=null)
		try {
			throw new NullPointerException("Invalid email");
		} catch (NullPointerException e) {
			System.err.println("Null pointer exception");
			// TODO: handle exception
		}
		else
			this.bookName = bookName;
		
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) throws RangeCheckException {
		if(this.price<100||this.price>500)
		{
			throw new RangeCheckException("Invalid");
		}else {
		this.price = price;
		}
		//this.auther = auther;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
