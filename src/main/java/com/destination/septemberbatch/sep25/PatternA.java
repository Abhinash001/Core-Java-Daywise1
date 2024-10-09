package com.destination.septemberbatch.sep25;

public class PatternA {
	
	    public static void main(String[] args) {
	        int n = 5; // Height of the letter "A"

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j <= n; j++) {
	                // Print spaces
	                if (j == n / 2 - i || j == n / 2 + i || (i == n / 2 && j > 0 && j < n))  {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}


