/*Q1. Write a program to take input 2 number and a operator as a character and then print operators */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Result = " + (a + b));
        } else if (op == '-') {
            System.out.println("Result = " + (a - b));
        } else if (op == '*') {
            System.out.println("Result = " + (a * b));
        } else if (op == '/') {
            if (b != 0) {
                System.out.println("Result = " + (a / b));
            } else {
                System.out.println("Division by zero is not possible.");
            }
        } else {
            System.out.println("Invalid Operator");
        }

        sc.close();
    }
}