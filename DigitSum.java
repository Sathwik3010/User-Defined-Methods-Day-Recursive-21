package com.codegnan.ooprecursive;

public class DigitSum {

	public static int digitSum(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+digitSum(n/10);//3+12 2+1 1 =6
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitSum(123));
	}

}
