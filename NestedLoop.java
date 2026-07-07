
public class NestedLoop {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		for(int a=1;a<=5;a++) {		
		for(int b=1;b<=a;b++) {
					System.out.print("*");
				}
				System.out.println();
				
		}
	}
}
