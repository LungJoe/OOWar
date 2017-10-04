package Controllers;

import Models.*;

public class DeckController {
	
	public DealerDeck dealerDeck;
	public Player player1;
	public Player player2;
	
	public DeckController(){
		dealerDeck = new DealerDeck();
		player1 = new Player();
		player2 = new Player();
	}
	
	public void dealDeck(){
		boolean dealPlayer1 = true;
		while(!dealerDeck.cards.isEmpty()){
			if(dealPlayer1){
				player1.getPlayerDeck().cards.add(dealerDeck.cards.remove(0));
				dealPlayer1 = false;
			}
			if(!dealPlayer1){
				player2.getPlayerDeck().cards.add(dealerDeck.cards.remove(0));
				dealPlayer1 = true;
			}
		}
	}
}
