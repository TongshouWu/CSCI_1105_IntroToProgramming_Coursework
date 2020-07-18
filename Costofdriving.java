import java.util.Scanner;
/*
Author: Tongshou Wu
Date: 7/12/2020

This program is solve the cost of driving. 
 */
public class Costofdriving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		
		System.out.println("Enter the driving distance:");
		a = input.nextDouble();
		System.out.println("Enter miles per gallon:");
		b = input.nextDouble();
		System.out.println("Enter price per gallon:");
		c = input.nextDouble();
		
		d = (a / b) * c;
		
		System.out.println("The cost of driving is :" + d);

	}

}
