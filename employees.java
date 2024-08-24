package ex_3;

import java.util.Scanner;

class EMPLOYEE {
    String ename[];
    int eid[], basic[], n;
    double Da[], gross_sal[], IT[], net_sal[];
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        n = sc.nextInt();
        sc.nextLine(); 
        ename = new String[n];
        eid = new int[n];
        basic = new int[n];
        Da = new double[n];
        gross_sal = new double[n];
        IT = new double[n];
        net_sal = new double[n];

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

public class employees {
    public static void main(String[] args) {
        EMPLOYEE newemp = new EMPLOYEE();
        newemp.read();
        newemp.compute_net_sal();
        newemp.display();
    }
}
