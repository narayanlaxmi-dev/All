package com.dsa.amarsir.day7;

public class CircularTourProblem {

	static int findStartingPoint(int petrol[], int distance[], int start_from) {
		int n = petrol.length;
		int current_petrol = 0;
		int round = 0;
		for (int i = start_from; round < n; i = (i + 1) % n) {
			current_petrol += petrol[i] - distance[i];
			round++;
			if (current_petrol < 0)
				return findStartingPoint(petrol, distance, start_from + 1);
		}
		return start_from;
	}

	static int findStartingPointNoRecursion(int petrol[], int distance[], int start_from) {
	        int n = petrol.length;
	        int current_petrol = 0;
	        int round = 0;
	        
	        // Iterate through all the pumps
	        for (int i = start_from; round < n; i = (i + 1) % n) {
	            current_petrol += petrol[i] - distance[i];
	            round++;
	            
	            if (current_petrol < 0) {
	                start_from++;
	                current_petrol = 0;
	                round = 0;  // Reset round count
	            }
	        }
	        return start_from;
	    }

	public static void main(String[] args) {
		// Sample Input
		int[] petrol = { 6, 2, 7 };
		int[] distance = { 4, 6, 3 };
		int startIndex = findStartingPoint(petrol, distance, 0);
		System.out.println("Starting Pump Index: " + startIndex);
		int q = findStartingPointNoRecursion(petrol, distance, 0);
		System.out.println(q);

	}

}
