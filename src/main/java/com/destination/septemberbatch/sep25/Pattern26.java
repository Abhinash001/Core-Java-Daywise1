package com.destination.septemberbatch.sep25;

import java.util.Scanner;

public class Pattern26 {
	
	    public static void main(String[] args) {
	        int n = 5; // Number of rows for the top half
	        
	        // Top half
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }

	        // Bottom half
	        for (int i = n; i >= 1; i--) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }
	}

