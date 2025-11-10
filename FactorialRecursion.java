package com.codegnan.ooprecursive;

public class FactorialRecursion {

	public static int factorial(int n) {
		//base case
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);// recursive case
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
}
