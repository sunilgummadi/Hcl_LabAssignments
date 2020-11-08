package com.pojo;

public class Swap {
	private int temp;

	public void swap(int num1, int num2) {
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping the numbers became :" + num1 + " " + num2);
	}

}
