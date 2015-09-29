package org.dimigo.basic;

public class booktest {

	public static void main(String[] args) {

	
	book book = new book("미생", "윤태호", 1000);
	book book2 = new book("자바를 잡아라", "나자바");
	
	System.out.println(book.getTitle());
	System.out.println(book.getAuthor());
	System.out.println(book.getPage());
	System.out.println();
	//system.out.println("책제목: " + book.Title());
	//system.out.println("저자명: " + book.getauthor());
	
	System.out.println(	);
}
}
