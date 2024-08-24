package exp_2;

import java.util.Scanner;

public class matrix_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op=new Scanner(System.in);
		System.out.println("Enter the no of rows in a matrix");
		int rows=op.nextInt();
		System.out.println("Enter the no of columns in a matrix");
		int columns=op.nextInt();
		int a[][]=new int[rows][columns];
		int b[][]=new int[rows][columns];
		System.out.println("enter the values for the matrices");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("enter the value for a["+i+"]["+j+"]");
				a[i][j]=op.nextInt();
				System.out.println("enter the value for b["+i+"]["+j+"]");
				b[i][j]=op.nextInt();
			}
		}
		int c[][]=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				c[i][j]=a[i][j]+b[i][j];
				
			}
			
		}
		System.out.println("the Addition of matrices");
		for(int[] value:c) {
			for(int element:value ) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
	}

}
