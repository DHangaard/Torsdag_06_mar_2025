import java.util.ArrayList;

class Main{

	public static void main(String[] args){

		ArrayList<String> actions = new ArrayList<String>();

		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");
	
		// Test
		// System.out.println(actions.get(0));
	
		GameMenu gameMenu = new GameMenu(actions);

		// gameMenu.displayMenu();

		// 5.d
		String userChoice = gameMenu.getAction();

		// 5.g
		int userChoiceNum;
		
		try {
			userChoiceNum = Integer.parseInt(userChoice);
		
		} catch(NumberFormatException e) {
			userChoiceNum = 0;
		}	

		doAction(userChoiceNum);
	}

	// 5.e
	public static void doAction(int action){

		String message;

		switch(action) {
		case 1: message = "Starting the game now";
		break;

		case 2: message = "Fetching previously saved game data";
		break;

		case 3: message = "Game paused"; 
		break;

		case 4: message = "Ending game";
		break;  

		default: message = "Wrong input";
		}
		
		System.out.println(message);

	}
}