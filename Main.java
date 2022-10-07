package GissaNummret;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int random;
		int number;
		int numberOfGuesses = 0;
		String result;
		
		while(true) {
			random = (int) Math.round(Math.random()*100);
			System.out.println("Guess the random number between 0 and 100 until you guess it right: ");
			do {
				number = scan.nextInt();
				result = higherLower(number, random);
				System.out.println(result);
				numberOfGuesses++;
			}
			while(number != random);
			System.out.println("Congratulations! Your number was correct.\nThe number of guesses is: " + numberOfGuesses + "\n\nA new round has begun!");
			numberOfGuesses = 0;
		}

	}
	
	static String higherLower(int result,int random) {
		if(result < random) {
			return "Higher!";
		}
		else {
			return "Lower!";
		}
		
	}

}
