package com.pojo;

public class B extends A {
	float bonus = 1000;

	public int add(int num1, int num2, int num3) {
		return super.add(num1, num2) + num3;
	}

	public float totalSalary() {
		return super.salary + bonus;
	}
}
