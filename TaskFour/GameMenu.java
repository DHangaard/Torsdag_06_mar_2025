import java.util.ArrayList;

// 4.a
class GameMenu{

	// 4.b
	// Attributes
	private ArrayList<String> actions;

	// 4.c
	// Constructor
	GameMenu(ArrayList<String> actions){

		// 4.d
		this.actions = new ArrayList<String>();
		for (String action : actions){
			this.actions.add(action);
		}
	
	}

	// 4.h
	// Methods
	public void displayMenu(){
		for (String action : this.actions){
			System.out.println(action);
		}
	
	}

}