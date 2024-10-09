package com.destination.septemberbatch.sep25;

public class PatternC {

	    public static void main(String[] args) {
	        int n = 7; // Height of the letter "C"

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                // Conditions for printing "C"
	                if (j == 0 && i != 0 && i != n - 1 ||
	                		(i == 0 && j < n) ||
	                		(i == n - 1 && j < n))  {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}



