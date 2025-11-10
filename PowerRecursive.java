package com.codegnan.ooprecursive;

import java.util.Scanner;

public class PowerRecursive {

	public static long power(int x, int n) {
		if(n == 0)
			return 1;
		
		return x * power(x, n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
			
		long result = power(x, n);
		System.out.println(result);
		sc.close();
	}

}
