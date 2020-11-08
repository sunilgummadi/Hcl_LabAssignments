package com.main;

import com.pojo.Multiples;

public class MultipleMain {

	public static void main(String[] args) {
		System.out.println("Printing multiples of 3 as fizz, multiples of 5 as buzz and both as fizz buzz");
		Multiples multiples = new Multiples();
		for (int i = 1; i <= 100; i++) {
			if (multiples.isMultiple3(i)) {
				if (multiples.isMultiple5(i)) {
					System.out.println(i + " : fizz buzz");
				} else
					System.out.println(i + " : fizz ");
			} else if (multiples.isMultiple5(i)) {
				System.out.println(i + " : buzz");
			}
		}
		multiples = null;
	}

}
