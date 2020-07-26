import java.util.Scanner;
/*
Author: Tongshou Wu
Date: 7/25/2020

This program is write the algorithm for the linear equation.
 */
public class Exercise3_3Implementation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e = 0.0;
		double f = 0.0;
		double x = 0.0;
		double y = 0.0;
		
		System.out.println("Enter a");
		a = input.nextDouble();
		System.out.println("Enter b");
		b = input.nextDouble();
		System.out.println("Enter c");
		c = input.nextDouble();
		System.out.println("Enter d");
		d = input.nextDouble();
		System.out.println("Enter e");
		e = input.nextDouble();
		System.out.println("Enter f");
		f = input.nextDouble();
		
		
		if ((a * d) - (b * c) == 0) {
			System.out.println("The equation has no solution");
		}
		else {x = (e * d - b * f) / (a * d - b * c);
		y = (a * f - e * c) / (a * d - b * c);
		System.out.println("x :" + x);
		System.out.println("y :" + y);
			
		}
		}


}
