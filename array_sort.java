package ex_3;
import java.util.Scanner;

class Mixer {
    int arr[];
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        arr = new int[j];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
    }
    Mixer mix(Mixer A) {
        int[] mergedArray = new int[this.arr.length + A.arr.length];
        int i = 0, j = 0, k = 0;

        while (i < this.arr.length && j < A.arr.length) {
            if (this.arr[i] < A.arr[j]) {
                mergedArray[k++] = this.arr[i++];
            } else if (this.arr[i] > A.arr[j]) {
                mergedArray[k++] = A.arr[j++];
            } else {
                mergedArray[k++] = this.arr[i++];
                j++;
            }
        }
        while (i < this.arr.length) {
            mergedArray[k++] = this.arr[i++];
        }
        while (j < A.arr.length) {
            mergedArray[k++] = A.arr[j++];
        }
        Mixer result = new Mixer();
        result.arr = new int[k];
        System.arraycopy(mergedArray, 0, result.arr, 0, k);
        return result;
    }
    void display() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
} 
    public class array_sort {
    public static void main(String[] args) {
        Mixer mixer1 = new Mixer();
        Mixer mixer2 = new Mixer();
        System.out.println("Enter elements for the first array:");
        mixer1.accept();
        System.out.println("Enter elements for the second array:");
        mixer2.accept();
        Mixer mergedMixer = mixer1.mix(mixer2);
        System.out.println("Merged array:");
        mergedMixer.display();
    }
}