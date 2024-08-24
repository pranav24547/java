package exp_1;

import java.util.Scanner;

public class largest_number {
	static void max() {
		int x,y,z,n;
		Scanner lv= new Scanner(System.in);
		System.out.println("Enter the value of X:");
		x=lv.nextInt();
		System.out.println("Enter the value of Y");
		y=lv.nextInt();
		System.out.println("Enter the value of Z");
		z=lv.nextInt();
		
		System.out.println("1.Largest number using if else ladder\n2.Largest number using nested if");
		n=lv.nextInt();
		if(n==1) {
		if(x>y & x>z) {
			System.out.println(x+" is Greater Among y,z");
		}
		else if(y>x & y>z) {
			System.out.println(y+" is Greater Among x,z");
		}
		else {
			System.out.println(z+" is Greater Among x,y");
		}
		}
		else if(n==2) {
			if(x>y & x>z) {
				System.out.println(x+" is Greater Among y,z");
			}
			else {
				if(y>x & y>z) {
					System.out.println(y+" is Greater Among x,z");
				}
				else {
					System.out.println(z+" is Greater Among x,y");
				}
			}
		}
		else {
			System.out.println("invalid charater");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max();
		

	}

}
