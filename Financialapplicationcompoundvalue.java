import java.util.Scanner;

/*
Author: Tongshou Wu
Date: 7/12/2020

This program is to solve a Financial application: compound value.
 */
public class Financialapplicationcompoundvalue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e = 0.0;
		double f = 0.0;
		
		System.out.println("Enter monthly saving account:");
		a = input.nextDouble();
		
		a = 100 * (1 + 0.00417);
		b = (100 + a) * (1 + 0.00417);
		c = (100 + b) * (1 + 0.00417);
		d = (100 + c) * (1 + 0.00417);
		e = (100 + d) * (1 + 0.00417);
		f = (100 + e) * (1 + 0.00417);
		
		
		System.out.println("After the sixth month, the account value is" + f);
		

	}

}
