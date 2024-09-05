package ex_5;
import java.util.Scanner;

class Studente {
    private int registrationNumber;
    private String fullName;
    private int yearOfJoining;
    private short semester;
    private float GPA;
    private float CGPA;
    private static int nextRegistrationNumber = 1000;

    public Studente(String fullName, int yearOfJoining, short semester, float GPA, float CGPA) {
        this.registrationNumber = generateRegistrationNumber(yearOfJoining);
        this.fullName = fullName;
        this.yearOfJoining = yearOfJoining;
        this.semester = semester;
        this.GPA = GPA;
        this.CGPA = CGPA;
    }

    private int generateRegistrationNumber(int yearOfJoining) {
        return yearOfJoining * 100 + (++nextRegistrationNumber);
    }

    public void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + GPA);
        System.out.println("CGPA: " + CGPA);
    }

    // Sort by semester and CGPA
    public static void sortBySemesterAndCGPA(Studente[] students) {
      
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].semester > students[j + 1].semester ||
                    (students[j].semester == students[j + 1].semester &&
                     students[j].CGPA < students[j + 1].CGPA)) {
                    // Swap students[j] and students[j+1]
                    Studente temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }


    public static void sortByName(Studente[] students) {
    
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].fullName.compareToIgnoreCase(students[j + 1].fullName) > 0) {
                    // Swap students[j] and students[j+1]
                    Studente temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

   
}

public class studento2 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of students (minimum 5):");
	        int numStudents = scanner.nextInt();
	        scanner.nextLine();

	        if (numStudents < 5) {
	            System.out.println("Please enter at least 5 students.");
	            return;
	        }

	        Studente[] students = new Studente[numStudents];

	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Enter student " + (i + 1) + " details:");
	            System.out.print("Full Name: ");
	            String fullName = scanner.nextLine();
	            System.out.print("Year of Joining (e.g., 2012): ");
	            int yearOfJoining = scanner.nextInt();
	            System.out.print("Semester: ");
	            short semester = scanner.nextShort();
	            System.out.print("GPA: ");
	            float GPA = scanner.nextFloat();
	            System.out.print("CGPA: ");
	            float CGPA = scanner.nextFloat();
	            scanner.nextLine();

	            students[i] = new Studente(fullName, yearOfJoining, semester, GPA, CGPA);
	        }

	   
	        Studente.sortBySemesterAndCGPA(students);
	        System.out.println("\nStudent Details (Sorted by Semester and CGPA):");
	        for (Studente student : students) {
	            student.display();
	            System.out.println();
	        }

	        Studente.sortByName(students);
	        System.out.println("\nStudent Details (Sorted by Name):");
	        for (Studente student : students) {
	            student.display();
	            System.out.println();
	        }
	    }
	}

