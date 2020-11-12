package com.main;

import java.util.Date;

import com.mythread.MyThread;

/**
 * Write a program to assign the current thread to t1. Change the name of the
 * thread to MyThread. Display the changed name of the thread. Also it should
 * display the current time. Put the thread to sleep for 10 seconds and display
 * the time again.
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
