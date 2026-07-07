import java.util.Scanner;

public class IsEvenCheck {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean result = isEven(n);

        System.out.println(result);

        sc.close();
    }
}