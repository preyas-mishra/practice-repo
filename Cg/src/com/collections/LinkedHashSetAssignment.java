package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Book{
	int bookId;
	String bookName;
	String bookAuthor;
	int bookPrice;
	public Book(int bookId, String bookName, String bookAuthor, int bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	
} 

public class LinkedHashSetAssignment {

	public static void main(String[] args) {
		Book book1 = new Book(101, "Harry Potter","J.K.Rowling",500);
		Book book2 = new Book(102, "The GodFather","Mario Puzo",500);
		Book book3 = new Book(103, "Sherlock Holmes","Sir Arthur Conon Doyle",500);
		
		LinkedHashSet<Book> lhs = new LinkedHashSet<Book>();
		lhs.add(book1);
		lhs.add(book2);
		lhs.add(book3);
		
		Iterator it = lhs.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println("Book ID = "+book.bookId);
			System.out.println("Book Name = "+book.bookName);
			System.out.println("Book Author = "+book.bookAuthor);
			System.out.println("Book Price = "+book.bookPrice);
			System.out.println("----------------------------------");
		}

	}

}
