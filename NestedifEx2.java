

public class NestedifEx2 {
public static void main(String[] args) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter a number: ");
	int n=sc.nextInt();
	System.out.println("Your number is "+n);
	if( n>0) {
		System.out.println("number is positive: "+n);
		if(n%2==0) {
		System.out.println("number is even: "+n);
		}else {
			System.out.println("number is odd: "+n);
		}
	}else if(n<0) {
		System.out.println("number is negative: "+n);
	}else {
		System.out.println("number is zerouu");
	}
}
}
