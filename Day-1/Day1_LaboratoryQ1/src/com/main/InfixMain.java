package com.main;

import java.util.Scanner;

import com.pojo.InfixEvaluation;

public class InfixMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the expression :");
		String exp = scanner.nextLine();
		InfixEvaluation evaluation = new InfixEvaluation();
		System.out.println("The value is :" + evaluation.infixEvalutaion(exp));
		scanner.close();
	}
}
