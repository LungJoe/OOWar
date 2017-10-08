package Models;

import java.util.ArrayList;

public class WarVarient1 extends TwoPlayerWar{

	public WarVarient1(Players player1, Players player2, ArrayList<Card> deck) {
		super(player1, player2, deck);
	}
	
	public void awardWinner(){
    	winner.giveCards(downPile);
    	winner.addScore(downPile.size());
    }	
}
