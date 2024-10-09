package com.destination.septemberbatch.sep25;

public class SquareNumber {
	
	    public static void main(String[] args) {
	        int n = 5; // Size of the pattern (5x5)

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                // Calculate the value to print
	                int value = Math.min(Math.min(i, j), Math.min(n - i - 1, n - j - 1)) + 1;
	                System.out.print(value + " ");
	            }
	            System.out.println(); // Move to the next line
	        }
	    }
	}


