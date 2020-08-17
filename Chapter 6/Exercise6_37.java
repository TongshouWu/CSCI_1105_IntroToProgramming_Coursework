/*
Author: Tongshou Wu
Date: 8/17/2020

This program is the method returns a string for the number with one or more prefix 0s.
 */
import java.util.Scanner;
public class Exercise6_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = input.nextInt();
		System.out.println("Enter the width:");
		int width = input.nextInt();
		System.out.println(format(number, width));
		
		}
public static String format(int number, int width) {
	String stringInput = Integer.toString(number);
	int stringLength = stringInput.length();
	
	if(stringLength >= width) {
		return stringInput;
	}
	else {
		for(int i = 0; i < width - stringLength; i++) {
			stringInput = '0' + stringInput;
			
		}
		return stringInput;
	}
}
}
