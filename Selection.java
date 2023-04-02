gimport java.util.Scanner;

public class Selection {
	public static int age;

	public static void main(String[] args) {
		getAge();
		checkAge();
		
	}
	print static void getAge() {
	System.out.printIn(" enter your age");
	
	Scanner input = new Scanner(System.in);
	age = input.nextInt();
	
}
	public static void checkAge() {
		if(age <=40) { 
		printAge();
		
		}
	}
	
