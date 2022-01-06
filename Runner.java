package com.qa.conditionals;

public class Runner {

	public static void main(String[] args) {

		//calc
		
		Calc calc = new Calc();

		System.out.println(calc.add(4, 70));
		System.out.println(calc.multiply(6, 6));
		System.out.println(calc.subtract(57, 7));
		calc.divide(2, 27);
		
		//results

		Results myResults = new Results();

		myResults.phys = 150;
		myResults.chem = 150;
		myResults.bio = 150;

		myResults.displayResults();
		myResults.displayPercentage();

		//boolean
		
		Boolean boo1 = new Boolean();

		System.out.println(boo1.booTrue(1, 2, true));
		
		//flowchart

		Flowchart flowchart1 = new Flowchart();

		flowchart1.flowchart(4500);
		
		//blackjack
		
		BlackJack blackjack = new BlackJack();
		
		System.out.println(blackjack.blackJack(20, 20));
		
		
	}

}
