package Models;

import java.util.ArrayList;

public class WarVarient2 extends WarVarient1{

	public WarVarient2(Players player1, Players player2, ArrayList<Card> deck) {
		super(player1, player2, deck);
		
	}

	 public void awardWinner(){
			winner.setScore(winner.getScore() + downPile.size());
	    }
}
