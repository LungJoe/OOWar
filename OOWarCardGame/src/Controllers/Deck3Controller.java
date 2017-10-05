package Controllers;

import Models.*;

public class Deck3Controller extends DeckController {
	
	public Player player3;
	
	public Deck3Controller(){
		player3 = new Player();
	}
	
	public void dealDeck(){
		int count = 0;
		while(count != 51){
			if(count % 3 == 0)
				player1.getPlayerDeck().cards.add(dealerDeck.cards.remove(0));
			if(count % 3 == 1)
				player2.getPlayerDeck().cards.add(dealerDeck.cards.remove(0));
			if(count % 3 == 2)
				player3.getPlayerDeck().cards.add(dealerDeck.cards.remove(0));
			count++;
		}
	}
}
