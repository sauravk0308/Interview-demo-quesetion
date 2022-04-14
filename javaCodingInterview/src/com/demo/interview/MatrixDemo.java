package com.demo.interview;

import java.util.Scanner;
/*10.)How to read a nxn matrix from user
a.)Read the number of rows
b.)Read the number of columns
c.)Enter the elements of matrix
d.)Display the elements in the matrix*/

public class MatrixDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r, c;
		System.out.println("Enter the number of rows in matrix");
		r = sc.nextInt();
		System.out.println("Enter the number of columns in matrix");
		c = sc.nextInt();
		int matrix[][] = new int[r][c];
		System.out.println("Enter the elements of the matrix");
		for(int i=0; i < r; i++) {
			for(int j=0; j<c; j++) {
			matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Displaying the elements of the matrix");
		for(int i =0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
