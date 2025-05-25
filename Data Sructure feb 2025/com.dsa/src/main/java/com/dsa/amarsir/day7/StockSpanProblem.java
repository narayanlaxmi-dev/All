package com.dsa.amarsir.day7;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    // Method to calculate the stock span
    public int[] stockSpan(int[] price) {
        int[] spanSol = new int[price.length];  // Array to store the span values
        Stack<Integer> stack = new Stack<>();   // Stack to store indices

        // Iterate over all the prices
        for (int i = 0; i < price.length; i++) {
            // Pop from the stack while the price is greater than or equal to the price at stack.peek()
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) 
                stack.pop();
            

            // If the stack is empty, the span is i + 1, else it's the difference between current index and the top index of the stack
            spanSol[i] = stack.isEmpty() ? i + 1 : i - stack.peek();

            // Push the current index to the stack
            stack.push(i);
        }
        return spanSol;
    }

    public static void main(String[] args) {
        // Example stock prices
        int[] price = { 100, 80, 60, 70, 60, 75, 85 };

        // Create an instance of StockSpanProblem
        StockSpanProblem stockSpanProblem = new StockSpanProblem();

        // Call the stockSpan method
        int[] spanSol = stockSpanProblem.stockSpan(price);

        // Print the result
        System.out.println("price:    "+Arrays.toString(price));
        System.out.println("Stock Span: " + Arrays.toString(spanSol));
    }
}
