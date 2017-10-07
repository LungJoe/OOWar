package Models;

public class Logger {
	Players player1, player2, player3;
	
	
	public void setPlayers(Players p1, Players p2){
		player1 = p1;
		player2 = p2;
	}
	
	public void setThreePlayers(Players p1, Players p2, Players p3){
		player1 = p1;
		player2 = p2;
		player3 = p3;
	}
	
	public void initialDraw(Card cardA, Card cardB){
		System.out.println(player1.getName() + " plays \t" + cardA.toString() + " as up card.");
		System.out.println(player2.getName() + " plays \t" + cardB.toString() + " as up card.");
	}
	
	public void initialDrawThreePlayer(Card cardA, Card cardB, Card cardC){
		System.out.println(player1.getName() + " plays \t" + cardA.toString() + " as up card.");
		System.out.println(player2.getName() + " plays \t" + cardB.toString() + " as up card.");
		System.out.println(player3.getName() + " plays \t" + cardC.toString() + " as up card.");
	}

	
	public void roundWinner(Players winner){
		System.out.println(winner.getName() + " wins the round!");
	}
	
	public void currentScore(int player1Score, int player2Score){
		System.out.printf("SCORE is %s %d, %s %d\n\n", 
				player1.getName(), player1Score, 
				player2.getName(), player2Score);
	}
	
	public void currentScoreThreePlayer(int player1Score, int player2Score, int player3Score){
		System.out.printf("SCORE is %s %d, %s %d, %s %d\n\n",
		player1.getName(), player1Score, 
		player2.getName(), player2Score,
		player3.getName(), player3Score);

	}
	
	public void war(){
		System.out.println("WAR!\n");
	}
	
	public void gameWinner(Players gameWinner){
		System.out.printf("----------------------------------\n"
							+ "%s won the game!"
							+ "\n----------------------------------", 
							gameWinner.getName());
	}
	
	public void draw(){
		System.out.println("----------------------------------\n"
				+ "It's a DRAW!"
				+ "\n----------------------------------" );
	}
	
	public void emptyDeck(String name){
		System.out.println(name + " ran out of cards!");
	}
	 public void numberOfRoundsReached(){
		 System.out.println("~~The number of rounds has expired.~~\n");
	 }	
}
