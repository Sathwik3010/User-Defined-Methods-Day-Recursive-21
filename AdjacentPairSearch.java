package com.codegnan.ooprecursive;

import java.util.Scanner;

public class AdjacentPairSearch {

	public static boolean findPair(int[] arr, int n, int target) {
		if(n<2)
			return false;
		if(arr[n-1]+arr[n-2] == target)
			return true;
		
		return findPair(arr, n-1, target);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt(); // array size
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        int target = sc.nextInt();

	        boolean result = findPair(arr, n, target);
			if(result)
				System.out.println("found");
			else
			    System.out.println("not found");
	        sc.close();
	}

}
