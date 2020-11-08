package com.main;

import com.pojo.FirstClass;
import com.pojo.SecondClass;

public class OOPExercises {

	public static void main(String[] args) {
		FirstClass objA = new FirstClass();/*
											 * prints -in the constructor of class FirstClass: a = 100 a = 333
											 */
		SecondClass objB = new SecondClass();/*
												 * prints-----in the constructor of class B: b = 123.45 b = 3.14159
												 */
		System.out.println("in main(): ");
		System.out.println("objA.a = " + objA.getFirstClass());/*
																 * in main(): objA.a = 333
																 */
		System.out.println("objB.b = " + objB.getSecondClass());/* prints-objB.b = 3.14159 */
		objA.setFirstClass(222);
		objB.setSecondClass(333.33);
		System.out.println("objA.a = " + objA.getFirstClass());
		System.out.println("objB.b = " + objB.getSecondClass());/*
																 * prints -objA.a = 222 objB.b = 333.33
																 */
	}

}
