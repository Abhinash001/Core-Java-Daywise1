package com.destination.septemberbatch.sep25;

	import java.util.Scanner;

	public class StarPattern {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking input from the user for number of rows
	        System.out.print("Enter the number of rows: ");
	        int rows = sc.nextInt();

	        // Outer loop for number of rows
	        for (int i = 1; i <= rows; i++) {
	            // Inner loop for printing stars in each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        
	        sc.close();
	    }
	}