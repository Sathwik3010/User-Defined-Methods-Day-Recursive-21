package com.codegnan.ooprecursive;

import java.util.Scanner;

public class SumNaturalNumbers {

	public static int findSum(int n) {
		if(n == 0) {
			return 0;
		}
		return n + findSum(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = findSum(n);
		System.out.println(sum);
		sc.close();
	}

}
