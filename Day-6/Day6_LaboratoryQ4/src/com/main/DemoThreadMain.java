package com.main;

/**
 * 
 * @author sunil
 *Creating three Threads by extending Thread Class
 *and printing the name
 */
public class DemoThreadMain extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				System.err.println(e);
			}
			System.out.println(Thread.currentThread().getName() +" :"+ i);
		}
	}

	public static void main(String[] args) {
		DemoThreadMain thread1 = new DemoThreadMain();
		DemoThreadMain thread2 = new DemoThreadMain();
		DemoThreadMain thread3 = new DemoThreadMain();
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
