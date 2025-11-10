package com.codegnan.ooprecursive;

import java.util.Scanner;

public class ArraySumRecursive {
	public static int findSum(int[] arr, int n) {
		if(n ==0) {
			return 0;
		}
		
		return findSum(arr, n-1)+arr[n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum = findSum(arr, n);
		System.out.println(sum);
		sc.close();
	}

}
