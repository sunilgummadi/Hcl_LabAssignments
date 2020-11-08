package com.main;

import com.pojo.A;

public class OOPExercises {
	public static void main(String[] args) {
		A objA = new A();
		System.out.println("in main(): ");
		System.out.println("objA.a = " + objA.a);// since variable a is private we cannot access the variable value in
													// this class
		objA.a = 222;// since variable is private we cannot assign a value to it.If we want to assign
						// we can do it by calling the setter function obj.setA()
	}
}
