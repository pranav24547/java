package ex_4;
import java.util.Scanner;

class EMPLOYEE {
    String ename[];
    int eid[], basic[], n;
    double Da[], gross_sal[], IT[], net_sal[];


    public EMPLOYEE() {
     
        n = 0;
        ename = new String[0];
        eid = new int[0];
        basic = new int[0];
        Da = new double[0];
        gross_sal = new double[0];
        IT = new double[0];
        net_sal = new double[0];
    }


    public EMPLOYEE(int numEmployees) {
        n = numEmployees;
        ename = new String[n];
        eid = new int[n];
        basic = new int[n];
        Da = new double[n];
        gross_sal = new double[n];
        IT = new double[n];
        net_sal = new double[n];
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Details");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee ID: " + (i + 1));
            System.out.print("Name: ");
            ename[i] = sc.nextLine();
            System.out.print("Basic Pay: ");
            basic[i] = sc.nextInt();
            sc.nextLine();
            eid[i] = i + 1;
        }
    }

    void compute_net_sal() {
        for (int i = 0; i < n; i++) {
            Da[i] = (52.0 / 100) * basic[i];
            gross_sal[i] = basic[i] + Da[i];
            IT[i] = (30.0 / 100) * gross_sal[i];
            net_sal[i] = gross_sal[i] - IT[i];
        }
    }

    void display() {
        for (int i = 0; i < n; i++) {
            System.out.println("Employee ID: " + eid[i]);
            System.out.println("Employee Name: " + ename[i]);
            System.out.println("Employee Net Salary: " + net_sal[i]);
        }
    }
}

public class employeess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int numEmployees = scanner.nextInt();

      
        EMPLOYEE newemp = new EMPLOYEE(numEmployees);

    
        newemp.read();
        newemp.compute_net_sal();
        newemp.display();
    }
}
