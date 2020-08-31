import java.util.Scanner;
/*
Author: Tongshou Wu
Date: 08-27-2020

This program is add two matrices.
 */
public class Exercise8_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double [][] matrix1 = new double [3][3];
		double [][] matrix2 = new double [3][3];
		
		System.out.println("Enter matrix 1: ");
		for(int a = 0; a < matrix1.length; a++) {
			for(int b = 0; b < matrix1[a].length; b++) {
				matrix1[a][b] = input.nextDouble();
			}
		}
		
		System.out.println("Enter matrix 2: ");
		for(int a = 0; a < matrix2.length; a++) {
           for(int b = 0; b < matrix2[a].length; b++) {
        	   matrix2[a][b] = input.nextDouble();
           }
		}
		double [][]matrix3 = addMatrix(matrix1, matrix2);
		
		System.out.println("The sum of the matrices is: ");
		for(int a = 0; a < matrix3.length; a++) {
			for(int b = 0; b < matrix3[a].length; b++) {
				System.out.print(matrix3[a][b] + "  ");
			}
			System.out.println();
		}
	}
		public static double [][] addMatrix(double[][] matrix1, double[][] matrix2){
			double [][] matrix3  = new double [3][3];
			for(int a = 0; a < matrix3.length; a++) {
				for(int b = 0; b < matrix3[a].length; b++) {
					matrix3[a][b] = matrix1[a][b] + matrix2[a][b];
				}
			}
			return matrix3;
		}
	}


