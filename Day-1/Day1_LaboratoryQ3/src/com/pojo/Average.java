package com.pojo;

public class Average {
	public float average(float... num1) {
		float sum = 0;
		for (int i = 0; i < num1.length; i++) {
			sum += num1[i];
		}
		return sum / num1.length;
	}
}
