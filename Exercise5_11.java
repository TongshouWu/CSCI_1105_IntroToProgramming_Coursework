/*
Author: Tongshou Wu
Date: 8/13/2020

This program that displays all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, 
but not both. 
 */
public class Exercise5_11 {

	public static void main(String[] args) {
		System.out.println("Counting From 100 - 200");
		System.out.println("Divisible by 5 or 6, " + "but not 5 and 6");
		System.out.println("-------------------------------------------------------");
		
		final int NUMBER_PER_LINE = 10;
		int number = 99;
		int count = 1;
		while(number <= 200) {
			int mod5 = number % 5;
			int mod6 = number % 6;
			
			if(mod5 == 0 ^ mod6 ==0) {
				if(count % NUMBER_PER_LINE == 0) {
					System.out.println(number + " ");
					count ++;
				}
				else {
					System.out.print(number + " ");
					count ++;
				}
			}
			number ++;
		}
		
		 }
		
         }


