package Models;

import java.util.ArrayList;

public abstract class War {
	CompareCards comparer;
	Logger log;
	ArrayList<Card> downPile;
	int compareValue;
	Players winner;
	
	public War(){
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
