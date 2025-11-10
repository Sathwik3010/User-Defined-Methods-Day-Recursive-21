package com.codegnan.ooprecursive;

public class print_0_To_n {

	public static void printUp(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printUp(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printUp(5);
	}

}
