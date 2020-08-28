import java.util.Scanner;
/*
Author:Tongshou Wu
Date:08/25/2020

This program is Find the smallest element.
 */
public class Exercise7_9 {

	public static void main(String[] args) {
		System.out.println("Enter 10 numbers separated by a space:");
		Scanner input = new Scanner(System.in);
		double[] myList = new double[10];
		for(int i = 0; i < 10; i++) {
			myList[i] = input.nextDouble();}
			
			System.out.println("The minimum number is:" + minimum(myList));
	}
			
			public static double minimum(double[] array) {
				double minimum = array[0];
				for(int i = 0; i < 10; i++) {
					if(array[i] < minimum) {
						minimum = array[i];
					}
				
				}
				return minimum;
			}
		
	}


