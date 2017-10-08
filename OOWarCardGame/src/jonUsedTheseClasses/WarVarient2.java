package jonUsedTheseClasses;

import java.util.ArrayList;

public class WarVarient2 extends TwoPlayerWar {

	public WarVarient2(Players player1, Players player2, ArrayList<Card> deck) {
		super(player1, player2, deck);
	}
	
	public void awardWinner(){
    	winner.addScore(downPile.size());
    }
}
