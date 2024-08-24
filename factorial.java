package exp_1;

import java.util.Scanner;

public class factorial {
	static int fact(int a) {		
		int n=1;
		for(int i=a;i>0;--i) {
			n*=i;
		}
		return n;
	}
	static int nCr(int n,int r) {
		int numerator=fact(n);
		int denominator=fact(r)*fact(n-r);
		return  numerator/denominator;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner lm=new Scanner(System.in);
		System.out.println("Enter a value");
		a=lm.nextInt();
		System.out.println("Enter a value");
		b=lm.nextInt();
		System.out.println("factorial:"+fact(a)+"\nnCr:"+nCr(a,b));
	}

}
