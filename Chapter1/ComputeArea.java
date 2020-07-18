/*
Author: Tongshou Wu
Date: 7/3/2020

This program is compute area and perimeter of a rectangle.
 */
public class ComputeArea {

	public static void main(String[] args) {
	double width;
	double height;
	double area;
	double perimeter;
	
	width = 4.5;
	height = 7.9;
	
	area = width * height;
	perimeter = 2 * (width + height);
	
	System.out.println("The area for the rectangle" +
	 width + height + " is " + area);
	System.out.println("The perimeter for the rectangle" +
	 width + height + " is " + perimeter);

	}

}
