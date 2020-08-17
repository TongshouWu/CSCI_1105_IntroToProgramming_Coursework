/*
Author: Tongshou Wu
Date: 8/17/2020

This program is display matrix of 0s and 1s.
 */
import java.util.Scanner;
 class Exercise6_17 {

	public static void main(String[] args) {
		System.out.println("Enter n:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printMatrix(n);
	}
	public static void printMatrix(int n) {
	for(int i = 1; i <= n; i++) {
		for(int j = 1; j <= n; j++) {
			System.out.print((int)(Math.random() * 2) + " ");
		}
		System.out.print("\n");
	}
}
}
