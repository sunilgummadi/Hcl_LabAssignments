package com.pojo;

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		int sum = 1;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i == n / i)
					sum += i;
				else
					sum += (i + n / i);
			}
		}
		return sum + n;
	}

}
