package com.dsa.amarsir.day5algorithom;

import java.util.Arrays;

public class knumberth {

	static void findPair(int a[], int k) {
	    for (int i = 0; i < a.length; i++) {
	        for (int j = i + 1; j < a.length; j++) { // avoid checking same pair twice
	            if (a[i] + a[j] == k) {
	                System.out.println("( " + a[i] + " , " + a[j] + " ) = " + k);
	            }
	        }
	    }
	}


	static void findSum(Integer a[], int sum) {
	    Arrays.sort(a);
	    int start = 0;
	    int end = a.length - 1;

	    while (start < end) {
	        int total = a[start] + a[end];
	        if (total == sum) {
	            System.out.println(a[start] + " " + a[end]);
	            start++;
	            end--; // move both pointers after finding a valid pair
	        } else if (total < sum) {
	            start++;
	        } else {
	            end--;
	        }
	    }
	}


	public static void main(String[] args) {
	    int[] arr = {8, 7, 2, 5, 3, 1};
	    Integer[] arr1 = {8, 17, 2, 53, 3, 1};
	    int targetSum = 10;

	    System.out.println("Using Brute Force:");
	    findPair(arr, targetSum);

	    System.out.println("\nUsing Two Pointer Method:");
	    findSum(arr1, targetSum);
	}


}
