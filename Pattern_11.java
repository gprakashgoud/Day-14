package com.codegnan.patternexamples;

public class Pattern_11 {

	public static void main(String[] args) {
    int n=7;
    for(int i=0; i<n; i++) {
    	for(int j=0; j<n; j++) {
    		if(i==0 || i==n-1) {
    			System.out.print("* ");
    		}else if (j==i ||j==(n-1-i)) {
    		System.out.print("* ");	
    		}
    		else {
    			System.out.print("  ");
    		}
    	}
    	System.out.println();
    }
	}

}
