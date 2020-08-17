/*
Author: Tongshou Wu
Data: 8/17/2020

This program is Palindrome integer.
 */
import java.util.Scanner;
public class Exercise6_3 {

	public static void main(String[] args) {
		System.out.println("Enter the integer:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		if(isPalindrome(number)) {
			System.out.println("The number " +  number + " is a Palindrome integer");
		}
		else {
			System.out.println("The number " + number + " isn't a Palindrome integer");
		}
		}
        public static boolean isPalindrome(int number) {
        	boolean palindrome = true;
        	int backwords = reverse(number);
        	if(backwords == number) {
        		palindrome = true;
        	}
        	else {
        		palindrome = false; 
        	}
        	return palindrome;
        }
        
        public static int reverse(int number) {
        	int reversenumber = 0;
        	while(number != 0) {
        		reversenumber = reversenumber * 10 + number % 10;
        		number = number / 10;
        	}
        	return reversenumber;
        }
        
}
 