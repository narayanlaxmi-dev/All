package com.dsa.amarsir.day6;

import java.util.Scanner;

public class HeapSort {

    public static void heapSort(int[] x, int n) {
        int pc, done, t;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                pc = j;
                done = 0;
                while (pc >= 0 && pc / 2 >= 0 && done != 1) { // 
                    if (x[pc] > x[pc / 2]) {
                        t = x[pc];
                        x[pc] = x[pc / 2];
                        x[pc / 2] = t;
                        pc = pc / 2;
                    } else {
                        done = 1;
                    }
                }
                
            }
            t = x[0];// 0 to ith swap
            x[0] = x[i];
            x[i] = t;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] x = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        heapSort(x, n);

        System.out.println("Sorted elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(x[i]);
        }

        sc.close();
    }
}