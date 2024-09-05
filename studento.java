//package ex_5;
//import java.util.Scanner;
//
//class STUDENTSS {
//    String sname;
//    private int[] marks_array;
//    private int total;
//    private float avg;
//
//    public STUDENTSS() {
//        sname = "";
//        marks_array = null;
//        total = 0;
//        avg = 0;
//    }
//
//    public STUDENTSS(String name, int[] marks) {
//        sname = name;
//        marks_array = marks;
//        total = 0;
//        avg = 0;
//    }
//
//    public void compute() {
//        for (int com : marks_array) {
//            total += com;
//        }
//        avg = (float) total / marks_array.length;
//    }
//
//    public void display() {
//        System.out.println("Student Name: " + sname);
//        System.out.println("Marks:");
//        for (int lol : marks_array) {
//            System.out.println(lol);
//        }
//        System.out.println("Total: " + total);
//        System.out.println("Average: " + avg);
//    }
//
//    public String extractInitials() {
//        String[] parts = sname.split(" ");
//        StringBuilder initials = new StringBuilder();
//        for (String part : parts) {
//            initials.append(part.charAt(0));
//        }
//        return initials.toString().toUpperCase();
//    }
//
//    public String removeWhitespace() {
//        return sname.replace(" ", "");
//    }
//
//    public static void listNamesContainingSubstring(STUDENTSS[] students, String substring) {
//        for (STUDENTSS student : students) {
//            if (student.sname.toLowerCase().contains(substring.toLowerCase())) {
//                System.out.println(student.sname);
//            }
//        }
//    }
//
//    public static void sortAlphabetically(STUDENTSS[] students) {
//        int n = students.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (students[j].sname.compareToIgnoreCase(students[j + 1].sname) > 0) {
//                
//                    STUDENTSS temp = students[j];
//                    students[j] = students[j + 1];
//                    students[j + 1] = temp;
//                }
//            }
//        }
//    }
//}
//
//public class studento {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the number of students:");
//        int numStudents = scanner.nextInt();
//        scanner.nextLine(); 
//
//        STUDENTSS[] studentArray = new STUDENTSS[numStudents];
//
//        for (int i = 0; i < numStudents; i++) {
//            System.out.println("Enter student name:");
//            String name = scanner.nextLine();
//
//            System.out.println("Enter the number of subjects:");
//            int numSubjects = scanner.nextInt();
//            int[] marks = new int[numSubjects];
//
//            System.out.println("Enter the marks of the subjects:");
//            for (int j = 0; j < numSubjects; j++) {
//                marks[j] = scanner.nextInt();
//            }
//            scanner.nextLine(); 
//
//            studentArray[i] = new STUDENTSS(name, marks);
//            studentArray[i].compute();
//        }
//
//        System.out.println("\nStudent Details:");
//        for (STUDENTSS student : studentArray) {
//            student.display();
//            System.out.println("Initials: " + student.extractInitials());
//            System.out.println("Name without whitespace: " + student.removeWhitespace());
//            System.out.println();
//        }
//
//       
//        System.out.println("Enter a substring to search for:");
//        String substring = scanner.nextLine();
//        System.out.println("Students with '" + substring + "' in their name:");
//        STUDENTSS.listNamesContainingSubstring(studentArray, substring);
//
//
//        STUDENTSS.sortAlphabetically(studentArray);
//        System.out.println("\nSorted student names:");
//        for (STUDENTSS student : studentArray) {
//            System.out.println(student.sname);
//        }
//    }
//}
