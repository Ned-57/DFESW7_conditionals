package com.qa.conditionals;

public class Calc {

	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int subtract(int a, int b) {
		int sub = a - b;
		return sub;
	}

	public int multiply(int a, int b) {
		int product = a * b;
		return product;
	}

	public void divide(double a, double b) {
		if (a > b) {
			double div = a / b;
			System.out.println(div);
		} else {
			System.out.println("The division cannot be performed");
		}

	}

}
