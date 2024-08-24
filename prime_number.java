package exp_2;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mi=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=mi.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=mi.nextInt();	
		}
		System.out.println("the prime numbers");
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0 & a[i]!=1) {
				System.out.println(a[i]);
				}
		}
	}
}