package com.exercise;

import java.util.NoSuchElementException;

public class BookService {

	Book[] bookList=new Book[10];
	int i=0;
	
	public Book[] getAllBooks(Book book) {
		
		bookList[i]=book;
		i++;
		return null;
		
	}
	
	public Book getOneBook(Book book) {
		
	
		try {
			
			return book;
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			
			System.err.println("No such element");
			e.printStackTrace();
			return null;
		}
		
		
	}
	
}
