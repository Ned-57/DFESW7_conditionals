package com.qa.conditionals;

public class UniqueSum {

	public int uniqueSum(int a, int b, int c) {
		if (a==b && b==c) {
			return 0;
		}
		if (a==b) {
			return c;
		}
		if (a==c) {
			return b;
		}
		if (b==c) {
			return a;
		}
		else {
			return a+b+c;
		}
		
	}
	
}
