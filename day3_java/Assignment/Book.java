package com.coforge.day3_java.Assignment;

public class Book {
	private int bid;
	private String title;
	private String author;
	private int price;
	
	public Book(int bid, String title, String author, int price) {
		this.bid = bid;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Book Details");
		System.out.println("Book Id : " + bid);
		System.out.println("Book Title : " + title);
		System.out.println("Book Author : " + author);
		System.out.println("Book Price : " + price);	
	}
}
