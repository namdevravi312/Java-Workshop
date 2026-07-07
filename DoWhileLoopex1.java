

public class DoWhileLoopex1 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			System.out.println("Square of "+n+" is "+n*n);
			System.out.println("Do you want to continue ");
			choice=sc.next();
	        
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("Thanks for using my app.");
	    sc.close();
	}

}
