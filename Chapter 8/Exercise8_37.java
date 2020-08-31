/*
 Author:Tongshou Wu
 Date:08/27/2020
 This program is Guess the capitals.
 */
import java.util.Scanner;

public class Exercise8_37 {
	public static void main(String[] args) {
		String[][] stateCapCity = {
				{"alabama", "montgomery"},
				{"alaska", "juneau"},
				{"arizona", "phoenix"},
				{"arkansas", "little rock"},
				{"california", "sacramento"},
				{"colorado", "denver"},
				{"oregon", "salem"},
				{"utah", "saltlake city"},
				{"texas", "austin"},
				{"washington", "olympia"}
				}; 
		int isTrue = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < stateCapCity.length; i++) {
			System.out.print("What is the capital of " + stateCapCity[i][0] + "? ");
			
			if (input.nextLine().toLowerCase().equals(stateCapCity[i][1])) {
				isTrue++;
				System.out.println("Correct!");
			}
			else
				System.out.println("That's Wrong.");
		};
		
		System.out.println("You got " + isTrue + " correct!");
	}
}
