package org.dimigo.thread;

public class Race2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread runner1 = new Thread(new Runner("홍길동"));
		Thread runner2 = new Thread(new Runner("홍길순"));
		
		runner1.setPriority(Thread.MAX_PRIORITY);
		runner2.setPriority(Thread.MIN_PRIORITY);
		
		runner1.start();
		runner2.start();
	}

}