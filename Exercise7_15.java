import java.util.Scanner;
/*
Author: Tongshou Wu
Date:08/27/2020

This program is Eliminate duplicates.
 */
public class Exercise7_15 {
   public static int[] eliminateDuplicates(int[] numberList) {
      int[] distinctList = new int[10];
      int number = 0;
      for(int j = 0; j  < 10; j++) {
         boolean numberIsDistinct = true;
         for(int k = j + 1; k < 10; k++) {
            if(numberList[j] == numberList[k]) {
               numberIsDistinct = false;
            }
         }
         if(numberIsDistinct == true) {
            distinctList[number] = numberList[j];
            number++;
         }
      }
      int[]arrayWithoutDuplicates = new int[number];
      for(int l = 0; l < number; l++) {
         arrayWithoutDuplicates[l] = distinctList[l];
      }
      return arrayWithoutDuplicates;

   }
   public static void main(String[] args) {
      System.out.println("Enter 10 numbers separated by a space: ");
      Scanner input = new Scanner(System.in);
      int[] enternumber = new int[10];
      for(int i = 0; i < 10; i++) {
         enternumber[i] = input.nextInt();

      }
      int [] afternumber = eliminateDuplicates(enternumber);

      System.out.print("\n");
      System.out.println("The number of the distinct number is: " + afternumber.length);
      System.out.print("\n");
      System.out.print("Array without duplicates: ");
      for(int n = 0; n < afternumber.length; n++) {
         System.out.print(afternumber[n] + " ");
      }
   }
}


