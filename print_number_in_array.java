package exp_2;

import java.util.Scanner;

public class print_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mo=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=mo.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=i+1;
		}
		System.out.println("The printed array");
		for(int value:a ) {
			System.out.println(""+value);
		}
		

	}

}
