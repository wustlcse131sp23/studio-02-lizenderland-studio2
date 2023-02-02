package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double startAmount, winChance, winLimit;
		System.out.println("Starting amount of money in $?");
		startAmount = in.nextDouble();
		System.out.println("Chance of winning in %?");
		winChance = in.nextDouble();
		System.out.println("Limit of winning in $?");
		winLimit = in.nextDouble();
		System.out.println("How many days will you play?");
		int totalSimulations = in.nextInt();
		int day = 1;
		while (day <= totalSimulations) {
			int play = 0;
			double money = startAmount;
			while (money < winLimit && money > 0) {

				double chance = Math.random() * 100;
				if (chance <= winChance) {
					money++;
					//System.out.println("This play is a win. Balance is $" + money);
				} else {
					money--;
					//System.out.println("This play is a loss. Balance is $" + money);
				} 
				play++;
			}
			if (money == winLimit) {
				System.out.println("Win limit reached, current balance is $" + money);
			} else if (money == 0) {
				System.out.println("Lost all money");
			} else {
				System.out.println("SOMETHING IS WRONG!!!");
			}
			System.out.println("The days is day number: " + day);
			day++;
			System.out.println("The number of plays today was:" + play);
		}


	}
}


