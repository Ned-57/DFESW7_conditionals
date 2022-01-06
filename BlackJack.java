package com.qa.conditionals;

public class BlackJack {
	
	public int blackJack(int num1, int num2) {
		if (num1 > 21 && num2 > 21) {
			return 0;
		}
		if (num1 > 21 && num2 < 21) {
			return num2;
		}
		if (num1 < 21 && num2 > 21) {
			return num1;
		}
		if (21-num1 < 21-num2) {
			return num1;
		}
		if (21-num1 > 21-num2) {
			return num2;
		}
		else {
			return 5;
		}
	}

}
