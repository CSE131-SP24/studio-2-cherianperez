package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startAmount, totalSimulations, roundsPerSimulation;
		double winChance, winLimit;
		
		//Scanning for user values
		Scanner in = new Scanner(System.in);
		System.out.println("Enter amount you wish to gamble with:");
		startAmount = in.nextInt();
		System.out.println("Enter the oddds of the game you are playing:");
		winChance = in.nextDouble();
		System.out.println("Enter amount you wish to stop gambling at:");
		winLimit = in.nextDouble();
		System.out.println("Enter number of simulations:");
		totalSimulations = in.nextInt();
		
		//int day = 0;
		
		//Playing the game
	
		double random = Math.random();
		Math.random();
		for (int day = 0; day <= totalSimulations; day++) {
		int dStartAmount = startAmount;
		while (winLimit >= dStartAmount && dStartAmount <= 0) {
			if (random > winChance) {
				dStartAmount = dStartAmount - 1;
			}
			else {
				dStartAmount ++;
		
			}
			if (winLimit >= dStartAmount) {
	
				System.out.println(day + " win");
			}
			if (dStartAmount <= 0) {
				
				System.out.println(day + " lose");
			}
		//creating a loop so that we play until start amount = win limit or 0
		
		
		
		}
		
	}
	}
}



