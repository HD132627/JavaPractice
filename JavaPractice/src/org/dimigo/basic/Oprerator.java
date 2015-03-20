package org.dimigo.basic;

public class Oprerator {

	public static void main(String[] args) {
		
		System.out.println("<< 도형 넓이 비교 >>");
		int a = 9;
	    int b = 10;
	    double h1 = 5.8;
	    double h2 = 5.4;
	    System.out.println("사다리꼴 넓이 : "+(a + b)*h1/2);
	    System.out.println("편행사변형 넓이 : "+ (a * h2));
	    double c = (a + b)*h1/2;
	    double d = (a * h2);
	    System.out.println("");
	    System.out.println("");  
	    System.out.println("사다리꼴이 평행사변형 보다 "+ (c - d) +" 더 큽니다.");
	    
	}
}
