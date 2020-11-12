package com.mythread;

import java.util.Date;

/**
 * 
 * @author sunil
 *
 */
public class MyThread extends Thread {
	public void run(){
		try {
			Thread.sleep(10000);
			System.out.println(new Date());
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		
	}
}
