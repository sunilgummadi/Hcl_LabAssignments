package com.mythread;

import java.util.Date;

/**
 * 
 * @author sunil
 *
 */
public class MyThread extends Thread {
	public void run(){
		
			Thread.sleep(10000);//If we remove try-catch block then we will get unhandled exception type InterruptedException
			System.out.println(new Date());
		
		
	}
}
