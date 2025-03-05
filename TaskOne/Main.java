// 1.a
class Main{
	
	public static void main(String[] args){

		// 1.g
		Team team1 = new Team("The A Team");

		// 1.i
		team1.setRank(1);

		// 1.k
		Team team2 = new Team("Here for the Cake");
		Team team3 = new Team("Tryhards");
		Team team4 = new Team("Boys only");
		Team team5 = new Team("Girl power");
		Team team6 = new Team("Last place");
	
		team2.setRank(2);
		team3.setRank(3);
		team4.setRank(4);
		team5.setRank(5);
		team6.setRank(6);

		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
		System.out.println(team5);
		System.out.println(team6);


		System.out.println(); // Empty line

		team1.addPlayer("John \"Hannibal\" Smith");
		team1.addPlayer("Templeton \"Faceman\" Peck");
		team1.addPlayer("H.M. \"Howling Mad\" Murdock");
		team1.addPlayer("Bosco \"Bad Attitude\" Baracus");
		System.out.println(team1);

	}

}