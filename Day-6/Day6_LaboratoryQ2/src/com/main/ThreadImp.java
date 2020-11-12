package com.main;

import java.util.Date;

import com.mythread.MyThread;

/**
 * In the previous program remove the try{}catch(){} block surrounding the sleep
 * method and try to execute the code. What is your observation?
 * 
 * @author sunil
 *
 */
public class ThreadImp {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		System.out.println("Default thread name :" + thread1.getName());
		thread1.setName("MyThread");
		System.out.println("Changed name of thread :" + thread1.getName());
		System.out.println(new Date());
		thread1.start();
		System.out.println("Current thread is in sleep for 10s");
	}

}
