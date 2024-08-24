package exp_1;

import java.util.Scanner;

public class reversed {
	static void reverse() {
		int x,y,c,reverse=0;
		Scanner wo=new Scanner(System.in);
		System.out.println("Enter the value");
		x=wo.nextInt();
		y=x;
		while(x!=0) {
			c=(x%10);
			reverse=reverse*10+c;
			x=x/10;
		}
		System.out.println("The Reversed Value:"+reverse);
		if(y==reverse) {
			System.out.println("Its a palindrome");
			
		}
		else {
			System.out.println("Its not a palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		reverse();

		

	}

}
