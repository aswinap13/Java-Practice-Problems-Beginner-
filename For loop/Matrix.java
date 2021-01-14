package com.itbulls.learnit.aswin.operations;

public class Matrix {

	public static void main(String[] args) {
		int matrix[][]= {
						{1, 2, 3, 4, 5},
						{6, 7},
						{8, 9, 10}
						};
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
