package com.destination.septemberbatch.sep25;

	
	import java.util.Scanner;

	public class HeartPattern {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the heart (recommended: 6 or more): ");
	        int n = scanner.nextInt();

	        // Upper part of the heart
	        for (int i = n / 2; i <= n; i += 2) {
	            for (int j = 1; j < n - i; j += 2) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Lower part of the heart
	        for (int i = n; i >= 1; i--) {
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= (i * 2) - 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}