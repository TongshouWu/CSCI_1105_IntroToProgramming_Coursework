import java.util.Scanner;

/*
Author: Tongshou Wu
Date:  7/10/2020

This program is Convert Celsius to Fahrenheit.
 */
public class ConvertCelsiustoFahrenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    double celsius = 0.0;
	    double fahrenheit = 0.0;
	    
	    System.out.println("Enter a number for celsius:");
	     celsius = input.nextDouble();
	    
	    fahrenheit = (9.0 / 5) * celsius + 32;
	    
	    System.out.println("fahrenheit :" + fahrenheit);
	

	}

}
