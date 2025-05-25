package com.dsa.amarsir.day5algorithom;

public class Sorting {
	static void bubble_sort(int a[]) {
		int i, j, temp;
		for (i = 0; i < a.length - 1; i++)// passes n-1
		{
			for (j = 0; j < a.length - 1 - i; j++)// sort
			{
				if (a[j] > a[j + 1])// then swap
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	static void bubble_sort_IMPROVED(int a[]) {
		int i, j, temp;
		for (i = 0; i < a.length - 1; i++)// passes n-1
		{
			boolean done = true;
			System.out.print("\npass" + i);
			for (j = 0; j < a.length - 1 - i; j++)// sort
			{
				if (a[j] > a[j + 1])// then swap
				{
					done = false;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (done)
				return;
		}
	}

	static void selection_sort(int a[]) {
		int i, j, minIndex, temp;
		for (i = 0; i < a.length - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			// Only swap if needed
			if (minIndex != i) {
				temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}
	}

	static void insertion_sort(int a[]) {
		int i, new_ele, j;
		for (i = 1; i < a.length; i++) {
			new_ele = a[i];
			j = i - 1;

			// Move elements of a[0..i-1], that are greater than new_ele, to one position
			// ahead
			while (j >= 0 && a[j] > new_ele) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = new_ele;
		}
	}

	static void quick_sort(int a[], int start, int end) {
		int i, j, temp, pivot;
		i = start;
		j = end;
		pivot = a[start];
		while (i < j) {
			while (a[i] < pivot)
				i++;
			while (a[j] > pivot)
				j--;
			if (i < j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		if (i < end)
			quick_sort(a, i + 1, end);
		if (j > start)
			quick_sort(a, start, j - 1);
	}
	
	static void merge_sort(int a[],int start,int end)
	{
	   if(start<end)
	   {
	       int mid=(start+end)/2;
	       merge_sort(a,start,mid);
	       merge_sort(a,mid+1,end);
	       System.out.print("\npass");
	       merger(a,start,mid,end);
	   }
	}
	static void merger(int a[],int start,int mid,int end)//0,0,1
	{
	   int i=start;
	   int j=mid+1;
	   int temp[]=new int[a.length];
	   int tindex=start;
	   while(i<=mid && j<=end)
	   {
	       if(a[i]<a[j])
	           temp[tindex++]=a[i++];
	       else
	           temp[tindex++]=a[j++];


	   }
	   while(i<=mid)
	       temp[tindex++]=a[i++];
	   while(j<=end)
	       temp[tindex++]=a[j++];
	   for(i=start;i<=end;i++)
	       a[i]=temp[i];
	}


	static void print_array(int a[]) {
		System.out.println("\nArray has");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
	}

	public static void main(String args[]) {
		int a[] = { 80, 10, 40, 20, 60, 50, 90, 30, 70 };
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Start");
		print_array(a);
//		bubble_sort(a);
		System.out.println("\nAfter sort");
		print_array(a);

		System.out.println("\nBest Bubble sort");
		bubble_sort_IMPROVED(arr);
		print_array(arr);
		System.out.println("\n------------------------");

		System.out.println("\nSelection sort");
		print_array(a);
//		selection_sort(a);
		print_array(a);

		System.out.println("\n-------- QUICK SORT----------------");
		print_array(a);
//		quick_sort(a, 0, a.length - 1);
		print_array(a);
		
		

		System.out.println("\n-------- MERGE SORT----------------");
		print_array(a);
		merge_sort(a, 0, a.length - 1);
		print_array(a);

	}
}
