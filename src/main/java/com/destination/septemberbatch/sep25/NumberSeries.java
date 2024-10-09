package com.destination.septemberbatch.sep25;
import java.util.Scanner;
public class NumberSeries {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Prompting the user for the number of rows
	        System.out.print("Enter the number of rows: ");
	        int rows = sc.nextInt();

	        // Loop to print the pattern
	        for (int i = 0; i < rows; i++) {
	            if (i % 2 == 0) {
	                // Print 11111 for even rows
	                System.out.println("11111");
	            } else {
	                // Print 00000 for odd rows
	                System.out.println("00000");
	            }
	        }
	        
	        sc.close();  // Closing scanner
	    }
	}





