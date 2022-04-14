package com.demo;

import java.util.Scanner;

public class MatrixDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in matrix");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns in matrix");
		int column = sc.nextInt();
		int matrix[][] = new int[row][column];
		System.out.println("Enter the elements of the matrix");
		for(int i=0; i<row; i++) {
			for(int j =0; j<column; j++) {
				matrix[i][j] = sc.nextInt(); 
			}
		}
		System.out.println("Displaying the elements of the matrix");
		for(int i=0; i<row; i++) {
			for(int j =0; j<column; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
