
package com.main;

/**
 * Write a program to create a class Number which implements Runnable. Run
 * method displays the multiples of a number accepted as a parameter. In main
 * create three objects - first object should display the multiples of 2, second
 * should display the multiples of 5 and third should display the multiples of
 * 8. Display appropriate message at the beginning and ending of thread. The
 * main thread should wait for the first object to complete. Display the status
 * of threads before the multiples are displayed and after completing the
 * multiples
 * 
 * @author sunil
 *
 */
public class Number implements Runnable {

	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("2MultiplesThread")) {
			System.out.println(Thread.currentThread().getName()+" starting ");
			System.out.println("Thread is in :"+Thread.currentThread().getState()+" state");
			int count =1;
			while(count<11) {
				System.out.println(2*count++);
			}
			System.out.println(Thread.currentThread().getName()+" ended ");
		}
		else if(Thread.currentThread().getName().equals("5MultiplesThread")) {
			System.out.println(Thread.currentThread().getName()+" starting ");
			System.out.println("Thread is in :"+Thread.currentThread().getState()+" state");
			int count =1;
			while(count<11) {
				System.out.println(5*count++);
			}
			System.out.println(Thread.currentThread().getName()+" ended ");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" starting ");
			System.out.println("Thread is in :"+Thread.currentThread().getState()+" state");
			int count =1;
			while(count<11) {
				System.out.println(8*count++);
			}
			System.out.println(Thread.currentThread().getName()+" ended ");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Number number = new Number();
		Thread thread1 = new Thread(number,"2MultiplesThread");
		Thread thread2 = new Thread(number,"5MultiplesThread");
		Thread thread3 = new Thread(number,"8MultiplesThread");
		thread1.start();
		thread2.join();
		thread2.start();
		thread3.join();
		thread3.start();
	}

}
