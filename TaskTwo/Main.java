// 2.c
import java.util.Scanner;

// 2.a
class Main{
	
	public static void main(String[] args){

		// 2.b
		System.out.println("Please type your name");

		// 2.c
		Scanner scanner = new Scanner(System.in);

		// 2.d
		String name = scanner.nextLine();

		// 2.e
		System.out.println("Hello " + name + "\nPlease type your age");

		// 2.f 
		int age = scanner.nextInt();

		// 2.g
		System.out.println("You are " + age + " years old");

		// 2.h
		int yearsUntilRetirement = 67-age;
		System.out.println("You have " + yearsUntilRetirement + " years until retirement");

	}

}