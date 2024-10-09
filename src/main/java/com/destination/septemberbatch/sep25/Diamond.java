package com.destination.septemberbatch.sep25;

	import java.util.Scanner;

	public class Diamond {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // We can use a fixed height of 9 for this specific pattern
	        int height = 9;
	        
	        // Upper part of the diamond
	        for (int i = 1; i <= height; i += 2) {
	            // Print leading spaces
	            for (int j = height; j > i; j -= 2) {
	                System.out.print(" ");
	            }
	            // Print numbers
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k);
	            }
	            System.out.println();
	        }
	        
	        // Lower part of the diamond
	        for (int i = height; i >= 1; i -= 2) {
	            // Print leading spaces
	            for (int j = height; j > i; j -= 2) {
	                System.out.print(" ");
	            }
	            // Print numbers
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k);
	            }
	            System.out.println();
	        }
	        
	        scanner.close();
	    }
	}


