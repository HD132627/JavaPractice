package org.dimigo.basic;

public class book {

	private String title = "미생";
	private String author = "윤태호";
	private int page = 1000;
	
	public book(){
		
	}
	public book(String Title, String author, int page) {
		this.Title = Title;
		this.author = author;
		this.page = page;
	}
	public book(String Title,String author){
		this(Title, author, 0);
	}
	public Book(String Title) {
		this(Title, "저자미상");
	}
	