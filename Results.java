package com.qa.conditionals;

public class Results {

	int phys;
	int chem;
	int bio;
	int total;
	double percent;

	int physPercent;
	int chemPercent;
	int bioPercent;

	public void displayResults() {
		total = phys + chem + bio;
		System.out.println("Physics score: " + "\n\t" + phys);
		System.out.println("Chemistry score: " + "\n\t" + chem);
		System.out.println("Biology score: " + "\n\t" + bio);
		System.out.println("Total score: " + "\n\t" + total);
	}

	public void displayPercentage() {
		percent = (total * 100) / 450;
		System.out.println("Total score as a percentage: " + "\n\t" + percent + "%");
		physPercent = (phys * 100) / 150;
		chemPercent = (chem * 100) / 150;
		bioPercent = (bio * 100) / 150;
		if ((physPercent < 60 & chemPercent < 60 & bioPercent > 59) || (physPercent < 60 & chemPercent > 59 & bioPercent < 60) || (physPercent > 59 & chemPercent < 60 & bioPercent < 60))  {
			System.out.println("You have failed two subjects.");
		}
		else if ((physPercent < 60 & chemPercent > 59 & bioPercent > 59) || (physPercent > 59 & chemPercent > 59 & bioPercent < 60) || (physPercent > 59 & chemPercent < 60 & bioPercent > 59)) {
			System.out.println("You have failed one subject.");
		}
		else if (physPercent < 60 & chemPercent < 60 & bioPercent < 60)  {
			System.out.println("You have failed all three subjects.");
		}
		else if (percent < 60) {
			System.out.println("You have failed.");}
		else
		 {System.out.println("Pass!");}
		}
	}


