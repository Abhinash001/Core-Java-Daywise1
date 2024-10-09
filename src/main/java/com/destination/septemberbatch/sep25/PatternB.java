package com.destination.septemberbatch.sep25;

public class PatternB {
	    public static void main(String[] args) {
	        int n = 7; // Height of the letter "B"

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                // Conditions for printing "B"
	                if (j == 0 || (i == 0 && j < n - 1) 
	                		|| (i == n / 2 && j < n - 1) ||
	                		(i == n - 1 && j < n - 1) || 
	                		(j == n - 1 && (i != 0 && i != n / 2 && i != n - 1)))  {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}


