package com.codegnan.oopmethods;

public class PerimeterCalculator {

	public static double reactanglePerimeter(double length, double width) {
		double perimeter = 2 * (length + width);
		return perimeter;
	}
	
	public static double squarePerimeter(double side) {
		double perimeter = 4 * side;
		return perimeter;
	}
	
	public double  circlePerimeter(double radius) {
		double perimeter = 2 * Math.PI * radius ;
		return perimeter;
	}
	
	public double  trianglePerimeter(double a, double b, double c) {
		double perimeter =a+b+c;
		return perimeter;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerimeterCalculator pc = new PerimeterCalculator();
		
		System.out.println(reactanglePerimeter(10,5));
		System.out.println(PerimeterCalculator.squarePerimeter(6));
		System.out.println(pc.circlePerimeter(7));
		System.out.println(pc.trianglePerimeter(3, 4, 5));
		
	}

}
