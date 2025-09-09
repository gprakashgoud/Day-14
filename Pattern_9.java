package com.codegnan.patternexamples;

public class Pattern_9 {

	public static void main(String[] args) {
		int rows = 4;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <=i; j++) {
				if (j == 0 || j == i) {
					System.out.print("1 ");

				} else {
					System.out.print(i + " ");
				}

			}
			System.out.println();

		}
	}

}
