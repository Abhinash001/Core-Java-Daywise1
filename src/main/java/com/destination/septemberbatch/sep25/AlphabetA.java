package com.destination.septemberbatch.sep25;
import java.util.Scanner;

public class AlphabetA{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++ ) {
				if(i==0 || i==n-1 || j==0 || j==(n-1)||
						i==(n/2) || j==(n/2) ||
						i==j || i+j==(n-1) || 
						i+j==(n/2)|| j-i==(n/2) ||
						i-j==(n/2)|| i+j==((n-1)+(n/2))){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		int i1 = 0;
		for(int j=0;j<n;j++) {
				if((i1==0 && j<=(n/2)) || (i1==(n/2) && j<=(n/2)) || j==0 || j==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++) {
				if((i1==0 && j!=0 && j<(n/2)) || (i1==(n/2) && j<=(n/2))
						|| (j==0 && i1!=0)|| (j==(n/2) && i1!=0)) {
					System.out.println("# ");
				}
				else {
						System.out.println("  ");
			}

		}
	}
	}
}
	




