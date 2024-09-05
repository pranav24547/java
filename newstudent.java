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

public class newstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannero = new Scanner(System.in);

        System.out.println("Enter the number of students (minimum5 5):");
        int numStudents = scannero.nextInt();
        scannero.nextLine(); 

        if (numStudents < 5) {
            System.out.println("Please enter at least 5 students.");
            return;
        }

        Studente[] studentso = new Studente[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student " + (i + 1) + " details:");
            System.out.print("Full Name: ");
            String fullName = scannero.nextLine();
            System.out.print("Year of Joining (e.g., 2012): ");
            int yearOfJoining = scannero.nextInt();
            System.out.print("Semester: ");
            short semester = scannero.nextShort();
            System.out.print("GPA: ");
            float GPA = scannero.nextFloat();
            System.out.print("CGPA: ");
            float CGPA = scannero.nextFloat();
            scannero.nextLine(); 

            studentso[i] = new Studente(fullName, yearOfJoining, semester, GPA, CGPA);
        }

        System.out.println("\nStudent Details:");
        for (Studente student : studentso) {
            student.display();
            System.out.println();
        }
    }

	}

}
