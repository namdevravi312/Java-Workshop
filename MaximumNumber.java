import java.util.Scanner;

public class MaximumNumber {

    static int max(int a, int b) {
        if(a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = max(a, b);

        System.out.println("Greater Number = " + result);

        sc.close();
    }
}