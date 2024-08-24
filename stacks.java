package ex_3;
import java.util.Scanner;
class Stack {
    int[] stackArray;
    int tos;
    void initialize(int size) {
        stackArray = new int[size];
        tos = -1; 
    }
    void push(int element) {
        if (tos == stackArray.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stackArray[++tos] = element;
            System.out.println(element + " pushed onto stack");
        }
    }
    int pop() {
        if (tos < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int poppedElement = stackArray[tos--];
            System.out.println(poppedElement + " popped from stack");
            return poppedElement;
        }
    }
    void display() {
        if (tos < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack contents:");
            for (int i = 0; i <= tos; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}
    public class stacks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        System.out.println("Enter the size of the stack:");
        int size = sc.nextInt();
        stack.initialize(size);
        while (true) {
            System.out.println("Choose an operation: 1. Push 2. Pop 3. Display 4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push:");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
