import java.util.Scanner;
/*
Author: Tongshou Wu
Date: 7/25/2020

This program is compute the perimeter of a triangle.
 */
public class Exercise3_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		System.out.println("Enter a");
		a = input.nextInt();
		System.out.println("Enter b");
		b = input.nextInt();
		System.out.println("Enter c");
		c = input.nextInt();
		
		if (a + b > c ||  a + c > b || b + c > a)   {
			d = a + b + c;
			System.out.println("perimeter :" + d);
			
		}
		else  {
			System.out.println("The input is invalid");
		}
	}

}
