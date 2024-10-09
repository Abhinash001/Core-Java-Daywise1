package com.destination.septemberbatch.sep25;

public class a {
	public static void main(String[] args) {
		

	for(int i=1;i<=5;i++){//row
		for(int j=1;j<=5;j++) { //column
			if (i==1 || j==5 || i==3 || j==1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
}
}
}