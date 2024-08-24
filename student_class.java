package ex_3;

import java.util.Scanner;

class STUDENT{
	String sname;
	int marks_array[];
	int total;
	float avg;
	void assign(String name,int marks[]) {
		sname=name;
		marks_array=marks;
		total=0;
		avg=0;
	}
	void compute() {
		for(int com:marks_array) {
			total+= com;
		}
		avg=total/marks_array.length;
		
		
		
	}
	void display() {
		System.out.println("Student Name:"+sname);
		System.out.println("Marks:");
		for(int lol:marks_array) {
			System.out.println(lol);
		}
		System.out.println("Total:"+total);
		System.out.println("Average:"+avg);
		
	}
	
}
public class student_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lo=new Scanner(System.in);
		STUDENT newstud=new STUDENT();
		System.out.println("Enter the student name:");
		String n=lo.nextLine();
		System.out.println("Enter the no of subjects:");
		int l=lo.nextInt();
		int arr[]=new int[l];
		System.out.println("Enter the marks of the subjects:");
		for(int i=0;i<l;i++) {
			arr[i]=lo.nextInt();
		}
		newstud.assign(n,arr);
		newstud.compute();
		newstud.display();
	}

}