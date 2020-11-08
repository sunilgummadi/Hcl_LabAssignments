package com.pojo;

public class Addition {
	public static void customAddition(int[] numbers) {
		String result = "" + numbers[0];
		int sum = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			sum += numbers[i];
			result += "+" + numbers[i];
			System.out.println(result + " =" + sum);
		}
	}
}
