package Models;

import java.util.ArrayList;

public class War2 {
	CompareCards comparer;
	Logger log;
	ArrayList<Card> gameDeck, downPile;
	int compareValue;
	Players winner;
	
	public War2(ArrayList<Card> deck){
    	gameDeck = deck;
    	downPile = new ArrayList<Card>();
    	comparer = new CompareCards();
    	log = new Logger();
	}
	
	/**
	public Players determineGameWinner(Players...players){
		Players highScorePlayer = players[0];
		
		for(Players player: players){
			if(player.getScore() > highScorePlayer.getScore())
				highScorePlayer = player;
		}
		return highScorePlayer;
	}
	**/
}
