package com.pojo;

import java.util.Stack;

public class InfixEvaluation {

	public int infixEvalutaion(String expression) {
		Stack<Integer> numbers = new Stack<Integer>();
		Stack<Character> operators = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (ch == ' ')
				continue;
			if (Character.isDigit(ch)) {
				int num = 0;
				while (Character.isDigit(ch)) {
					num = num * 10 + (ch - '0');
					i++;
					if (i < expression.length()) {
						ch = expression.charAt(i);
					} else
						break;
				}
				i--;
				numbers.push(num);
			} else if (ch == '(') {
				operators.push(ch);
			} else if (ch == ')') {
				while (operators.peek() != '(') {
					int output = performOperation(numbers, operators);
					numbers.push(output);
				}
				operators.pop();
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
				while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) {
					int output = performOperation(numbers, operators);
					numbers.push(output);
				}
				operators.push(ch);
			}
		}
		while (!operators.isEmpty()) {
			int output = performOperation(numbers, operators);
			numbers.push(output);
		}
		return numbers.pop();

	}

	static int precedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
			return 2;
		}
		return -1;
	}

	public int performOperation(Stack<Integer> numbers, Stack<Character> operators) {
		int num1 = numbers.pop();
		int num2 = numbers.pop();
		char operator = operators.pop();
		switch (operator) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num2 / num1;
		case '%':
			return num1 % num2;
		}
		return 0;
	}
}
