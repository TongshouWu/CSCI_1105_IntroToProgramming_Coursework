import java.util.Scanner;
/*
Author: Tongshou Wu
Date: 8/14/2020

This program is find the number of vowels and consonants in the string.
 */
public class Exercise5_49 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a phrase to find out how many vowels and consonants it contains:");
		
		String phraseOriginal = input.nextLine();
		String phrase = phraseOriginal.toUpperCase();
		
		int phraseLength = phrase.length();
		int vowelCount = 0;
		int consonantCount = 0;
		int spaceCount = 0;
		int i = 0;
		
		while (i < phraseLength) {
			if (phrase.charAt(i) == 'A' || phrase.charAt(i) == 'E' || phrase.charAt(i) == 'I' || phrase.charAt(i) == 'O' || phrase.charAt(i) == 'U') {
				vowelCount++;
			}
			else if (phrase.charAt(i) == ' '){
				spaceCount++;
			}
			else{
				consonantCount++;
			}
			i++;	
		}
		
		System.out.println("The phrase \"" + phraseOriginal + "\" has " + vowelCount + " vowels, " + consonantCount + " consonants, and " + spaceCount + " spaces.");		
	}
}