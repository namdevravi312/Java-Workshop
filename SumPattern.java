/*Q2. Write a print the numbers like 1+2+3+4+5=15 when the user give the input*/

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i);

            sum += i;

            if (i < n) {
                System.out.print("+");
            }
        }

        System.out.println("=" + sum);

        sc.close();
    }
}