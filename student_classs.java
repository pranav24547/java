package ex_4;
import java.util.Scanner;

class STUDENTSS {
    private String sname;
    private int[] marks_array;
    private int total;
    private float avg;


    public STUDENTSS() {
        sname = "";
        marks_array = null;
        total = 0;
        avg = 0;
    }

    public STUDENTSS(String name, int[] marks) {
        sname = name;
        marks_array = marks;
        total = 0;
        avg = 0;
    }


    public void compute() {
        for (int com : marks_array) {
            total += com;
        }
        avg = (float) total / marks_array.length;
    }


    public void display() {
        System.out.println("Student Name: " + sname);
        System.out.println("Marks:");
        for (int lol : marks_array) {
            System.out.println(lol);
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

public class student_classs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student name:");
        String name = scanner.nextLine();

        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        int[] marks = new int[numSubjects];

        System.out.println("Enter the marks of the subjects:");
        for (int i = 0; i < numSubjects; i++) {
            marks[i] = scanner.nextInt();
        }

   
        STUDENTSS student = new STUDENTSS(name, marks);
    
        student.compute();
        System.out.println("\nStudent Details:");
        student.display();
    }
}
