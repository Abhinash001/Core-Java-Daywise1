package com.test.p1;

import java.util.Scanner;

public class IdentityMatrix {

	    // Function to check if a matrix is an identity matrix
	    public static boolean isIdentityMatrix(int[][] matrix, int n) {
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i == j && matrix[i][j] != 1) { // Diagonal elements must be 1
	                    return false;
	                } else if (i != j && matrix[i][j] != 0) { // Non-diagonal elements must be 0
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the size of the matrix (n x n): ");
	        int n = scanner.nextInt();

	        int[][] matrix = new int[n][n];
	        System.out.println("Enter the elements of the matrix: ");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        if (isIdentityMatrix(matrix, n)) {
	            System.out.println("The matrix is an Identity Matrix.");
	        } else {
	            System.out.println("The matrix is not an Identity Matrix.");
	        }

	        scanner.close();
	    }
	}


