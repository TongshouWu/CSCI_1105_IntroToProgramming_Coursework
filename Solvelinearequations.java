/*
 Author: Tongshou Wu
 Date: 7/5/2020
 
 This program is solve a 2 * 2 linear equations.
 */
public class Solvelinearequations {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double x;
		double y;
		
		a = 3.4;
		b = 50.2;
		c = 2.1;
		d = 0.55;
		e = 44.5;
		f = 5.9;
		
		x = (e * d - b * f) / (a * d - b * c);
		y = (a * f - e * c) / (a * d - b * c);
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		

	}

}
