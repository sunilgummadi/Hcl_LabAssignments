package com.main;

/**
 * Write a program to create a class DemoThread1 implementing Runnable
 * interface. In the constructor, create a new thread and start the thread. In
 * run() display a message "running child Thread in loop : " display the value
 * of the counter ranging from 1 to 10. Within the loop put the thread to sleep
 * for 2 seconds. In main create 3 objects of the DemoTread1 and execute the
 * program.
 * 
 * @author sunil
 *Creating three threads by implementing Runnable interface
 */
public class DemoThreadMain implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("running child Thread in loop " + Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}

	public static void main(String[] args) {
		DemoThreadMain demoThreadMain = new DemoThreadMain();
		Thread thread1 = new Thread(demoThreadMain);
		Thread thread2 = new Thread(demoThreadMain);
		Thread thread3 = new Thread(demoThreadMain);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
