package com.codegnan.oopmethods;

public class AreaCalculator {

	public static void rectangleArea(double length, double breadth) {
		double area = length * breadth;
		System.out.println("Area of rectangle: "+area);
	}
	
	public static void circleArea(double radius) {
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle: "+area);
	}
	
	public static void squareArea(double side) {
		double area = side * side;
		System.out.println("Area of Square: "+area);
	}
	
	public static void triangleArea(double base, double height) {
		double area = 0.5 * base * height;
		System.out.println("Area of Triangle: "+area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangleArea(10.0,5.0);
		circleArea(5);
		squareArea(3);
		AreaCalculator.triangleArea(3.0, 2.0);
	}

}
