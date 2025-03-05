import java.util.ArrayList;
import java.util.Scanner;

// 4.a
class GameMenu{

	// Attributes
	private ArrayList<String> actions;

	// Constructor
	GameMenu(ArrayList<String> actions){

		this.actions = new ArrayList<String>();
		for (String action : actions){
			this.actions.add(action);
		}
	
	}

	// Methods
	public void displayMenu(){
		for (String action : this.actions){
			System.out.println(action);
		}
	
	}

	// 5.a
	public String getAction(){
		System.out.println("Type a number to choose an action");
		displayMenu();
	
		// 5.b
		Scanner scanner = new Scanner(System.in);
		String userChoice = scanner.nextLine();

		// 5.c
		return userChoice;

	}
}