package threads;

import java.util.Scanner;

class Alpha extends Thread{
	@Override
	public void run() {
		bank();
	}
	public void bank() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username:");
		int a=sc.nextInt();
		System.out.println("Enter pswd");
		int b=sc.nextInt();
		System.out.println("hey my bank work is done");
		
	}
}

class Beta extends Thread{
	@Override
	public void run() {
		try {
			print();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print() throws InterruptedException {
		for(int i=1;i<15;i++) {
			Thread.sleep(2000);
			System.out.println("VIJAY".repeat(i));
		}
	}
}


class Gama extends Thread{
	
	@Override
	public void run() {
		try {
			extra();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void extra() throws InterruptedException {
		for(int i=1;i<15;i++) {
			Thread.sleep(2000);
			System.out.println("ONO".repeat(i));
		}
	}
}


public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Application is started..........");
		
		Alpha a1 = new Alpha();
		
		Beta b1 = new Beta();
		
		Gama gm = new Gama();
		
		a1.start();
		b1.start();
		gm.start();
		
		System.out.println("Application is ended..........");

		
	}
}
