import java.util.ArrayList;

// 4.e
class Main{

	public static void main(String[] args){

		// 4.f
		ArrayList<String> actions = new ArrayList<String>();

		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");
	
		// Test
		// System.out.println(actions.get(0));
	
		// 4.g
		GameMenu gameMenu = new GameMenu(actions);

		gameMenu.displayMenu();
	}

}