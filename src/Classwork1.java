import java.util.Scanner;

	
public class Classwork1 {
	public static String Name;
	public static String State;
	public static String Department;
	public static String Concatenation;
	
		
	public static void main(String[] args) {
		printName();
		printState();
		printDepartment();
		printConcatenation();
		
		

		}
	public static void printName() {
		System.out.println("Please enter your preferred Name");
		
		Scanner input = new Scanner(System.in);
		Name = input.nextLine();
		
		
	}
	public static void printState() {
		System.out.println("Please enter your preferred State");
		
		Scanner input = new Scanner (System.in);
		State = input.nextLine();
	}
	public static void printDepartment() {
		System.out.println("Please enter your preferred Department");
		
		Scanner input = new Scanner (System.in);
		State = input.nextLine();
	}
	public static void printConcatenation() {
		System.out.println("My preferred name is" + Name + "My preferred state is" + State + "My preferred Department is" + Department );
		
		Scanner input = new Scanner (System.in);
		Concatenation = input.nextLine();
		
	}

	}

