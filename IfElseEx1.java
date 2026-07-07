
public class IfElseEx1 {

	public static void main(String[] args) {
	 java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.println("Enter your age: ");
	 int age=sc.nextInt();
	 if(age<0||age>100) {
	 System.out.println("Invalid age please enter a valid age.");
	 }else if(age<4){
		 System.out.println("You are a Infant.");
	 }else if(age<13) {
	 System.out.println("you are a child.");
	 }else if(age<19) {
		 System.out.println("You are teenager.");
	 }else if(age<40) {
		System.out.println("you are adult.");
	 }else if(age<80) {
		 System.out.println("you are a old.");
	 }else if(age<95) {
		 System.out.println("you are super old.");
	 }else {
		 System.out.println("you are very close to die");
	 }
	 System.out.println("thank you\nvisit again");
	}
	}


