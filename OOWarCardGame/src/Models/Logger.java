package Models;

import java.util.ArrayList;

public class Logger {
	ArrayList<Players> playerList = new ArrayList<Players>();
	
	
	public void setPlayers(Players...players){
		for(int i = 0; i < players.length; i++){
			playerList.add(players[i]);
		}
	}
	
	public void initialDraw(Card...cards){
		for(int i = 0; i < cards.length; i++){
			System.out.println(playerList.get(i).getName() + " plays \t" + cards[i].toString() + " as up card.");
		}
	}
	
	public void roundWinner(Players winner){
		System.out.println(winner.getName() + " wins the round!");
	}
	
	public void currentScore(Integer...scores){
		String scorePrintout = "SCORE is\t";
		for(int i = 0; i < scores.length; i++){
			scorePrintout += (playerList.get(i).getName() + ": " + scores[i] + "\t");
		}
		System.out.println(scorePrintout + "\n");
	}
	
	public void war(){
		System.out.printf("WAR!\n\n");
	}
	
	public void gameWinner(Players gameWinner){
		System.out.printf("----------------------------------\n"
							+ "      %s won the game!"
							+ "\n----------------------------------", 
							gameWinner.getName());
	}
	
	public void draw(){
		System.out.println("----------------------------------\n"
				+ "It's a DRAW!"
				+ "\n----------------------------------" );
	}
	
	public void draw(Players winner1, Players winner2){
		System.out.println("----------------------------------\n"
				+ "It's a DRAW between " + winner1.getName() + " and " + winner2.getName()
				+ "\n----------------------------------" );
	}
	
	public void fullDraw(){
		System.out.println("----------------------------------\n"
				+ "It's a three way DRAW!"
				+ "\n----------------------------------" );
	}
	
	public void emptyDeck(String name){
		System.out.println(name + " ran out of cards!");
	}
	 public void numberOfRoundsReached(){
		 System.out.println("~~The number of rounds has expired.~~\n");
	 }	
}
