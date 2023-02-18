import java.util.Scanner;
public class Strings {
	public static String greeting = "Hello. How are you?";
	
	public static void main(String [] args) {
		printHello();
		printlength();
		Case();
		Character();
		Concatenation();
		Concatenation1();
		Specialcharacter();
		Add();
		Add2();
	}

	public static void printHello() { 
	System.out.println("Please enter your preferred greeting");
	
	Scanner input = new Scanner (System.in);
		greeting = input.nextLine();
		System.out.println(greeting);
	}
		

	public static void printlength() {
		System.out.println("The length of the string is" + greeting.length());
		
		
	}
	public static void Case() {
		String txt= "Hello World";
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
	}
    public static void Character() {
    	String txt= "Please locate where 'locate' occurs!";
    	System.out.println(txt.indexOf("locate"));
    	
    }
    public static void Concatenation() {
    	String firstName= "Eyitayo";
    	String lastName= "Ajibabi";
    	System.out.println(firstName+ ""+ lastName);
    	
    }
    public static void Concatenation1() {
    	String firstName= "Eyitayo";
    	String lastName= "Ajibabi";
    	System.out.println(firstName.concat(lastName));
    
    }
    public static void Specialcharacter() {
    	String txt= "We are the so-called\"Vikings\" from the north";
    	String txt2= "It\'s alright";
    	String txt3= "The character\\ is called blacklash.";
    }
    
    public static void Add() {
    	int x= 10;
    	int y= 20;
    	int z= x+y;
    	System.out.println(z);
    }
    public static void Add2() {
    	String x= "10";
    	int y= 20;
    	String z= x+y;
    	System.out.println(z);
    	
    }
}

