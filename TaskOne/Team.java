import java.util.ArrayList;

// 1.b
class Team{

	// Attributes
	// 1.c	
	private String teamName;

	// 1.d
	private int rank;

	// 1.e
	private ArrayList<String> players;

	// 1.f
	// Constructor
	Team(String teamName){
		this.teamName = teamName;

		players = new ArrayList<String>();
	}

	// Methods
	// 1.h
	public void setRank(int rank){
		this.rank = rank;
	}

	// 1.j
	public String toString(){
		String message = "Team: \"" + teamName + "\" Rank: " + rank +"\n";  
		
		// 1.m
		for (String player : players){
		message += player+"\n";
		}

		return message;
	}

	// 1.l
	public void addPlayer(String name){
		players.add(name);
	}

}