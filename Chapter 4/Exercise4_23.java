import java.util.Scanner;
/*
Author: Tongshou Wu
Date: 8/9/2020

This program is write a financial application: payroll.
 */
public class Exercise4_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e = 0.0;
		double f = 0.0;
		double g = 0.0;
		double h = 0.0;
		double i = 0.0;
		double j = 0.0;
		
		System.out.println("Enter employee's name:");
		String a = input.nextLine();
		System.out.println("Enter number of hours work:");
		b = input.nextDouble();
		System.out.println("Enter hourly pay rate: $S");
		c = input.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		d = input.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		e = input.nextDouble();
		
		f = b * c;
		g = f * d;
		h = f * e;
		i = g + h;
		j = f - i;
		
		System.out.println("Employee name:" + a);
		System.out.println("Hours wored:" + b);
		System.out.println("Pay rate: $" + c);
		System.out.println("Gross pay: $" + f);
		System.out.println("Deductions:");
		System.out.printf("Federal Withholding (%.1f%%): $%.2f\n", d * 100, g);
		System.out.printf("State Withholding (%.1f%%): $%.2f\n", e * 100, h);
		System.out.printf("Total Deduction: $%.2f\n", i);
		System.out.printf("Net Pay: %.2f\n", j);
		
		
		
		
		
		
		
	}

}
