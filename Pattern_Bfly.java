package com.codegnan.patternexamples;

public class Pattern_Bfly {

	public static void main(String[] args) {
   int rows=5;
   for(int i=1;i<=rows;i++) {
	   for(int j=1;j<=i;j++) {
		   System.out.print("* ");
	   }
	   int spaces=2*(rows-i);
	   for(int j=1; j<=spaces;j++) {
		   System.out.print("  ");
		   
	   }
	   for(int j=1; j<=i;j++) {
		   System.out.print("* ");
	   }
	   System.out.println();
   }
	
	//lower part of butterfly pattern
	for(int i=rows;i>=1;i--) {
		//inner for loop 1 print stars as left wing in bottom part.
		for(int j=1; j<=i; j++) {
			System.out.print("* ");
			
			
		}
		//inner loop 2nd print the spaces in bottom part.
		int spaces=2*(rows-i);
		for(int j=1; j<=spaces;j++) {
			System.out.print("  ");
		}
		//inner for loop 3 print stars on right wing in bottom part.
		for(int j=1; j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
