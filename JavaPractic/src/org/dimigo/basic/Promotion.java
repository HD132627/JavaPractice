package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		System.out.println("<< 디미베네 연간 인건비 >>");
		int a = 1700000;
		int b = 3;
		int c= 1500;
		long d = (long)a * 12 * b * c ;
				System.out.println("월 평균 급여 : " +String.format("%,d", a)+"원" );
				System.out.printf("점포 내 직원 수 : %d명\n", b);
				System.out.println("점포 수 : " +String.format("%,d", c)+"개" );
				
				
				
				
				System.out.println("연간 인건비 : " +String.format("%,d", d)+"원" );
	}
}
