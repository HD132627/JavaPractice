package org.dimigo.thread;
public class Race {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner1 = new Runner("홍길동");
		Runner runner2 = new Runner("홍길순");
		
		runner1.start();
		runner2.start();
	}

}