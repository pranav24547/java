package exp_2;

import java.util.Scanner;

public class reversed_array {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = obj.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
//        for (int i = 0; i < n / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[n - 1 - i];
//            arr[n - 1 - i] = temp;
//        }
//        System.out.println("Reversed array:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
        for(int i=n-1;i>=0;i--) {
        	System.out.print(arr[i] + " ");
        }
    }
}
