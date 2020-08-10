import java.util.Scanner;
/*
Author: Tongshou Wu
Date:7/30/2020

This program is calculate the area of the pentagon.
 */

public class Exercise4_1 {

	public static void main(String[] args) {
	final double PI = 3.14159;	
    Scanner input = new Scanner(System.in);
    double a = 0.0;
    double b = 0.0;
    double c = 0.0;
    
    System.out.println("Enter the length from the center to the vertex");
	a = input.nextDouble();
	
	b = 2 * a * Math.sin(Math.PI / 5);
	c = (5 * Math.pow(b, 2)) / (4 * Math.tan(Math.PI / 5));
	
	System.out.println("The area of the pentagon is :" + c);
	
	
	
	}

}
