package Models;

import java.util.ArrayList;

public class Players {
	String name;
	int score;
	//ArrayList<Card> playerDeck;
	Deck playerDeck; 

	public Players(String name) {
		//playerDeck = new ArrayList<Card>();
		this.name = name;
		this.playerDeck = null;
		score = 0;
	}
	
	public Deck getDeck() {
		return playerDeck;
	}
	
	public void setDeck(Deck deck) {
		this.playerDeck = deck;
	}
	
	public Card drawCard() {
		try{
			return playerDeck.getNextCard();
		}catch(IndexOutOfBoundsException e){
			return null;
		}
	}

	public boolean hasCards(){
		if(getDeckSize() > 0)
			return true;
		else
			return false;
	}
	
	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}
	
	public int getDeckSize(){
		return playerDeck.getDeck().size();
	}
	
	public void setScore(int newScore) {
		score = newScore;
	}
	
	public void addScore(int points) {
		score += points;
	}

	public void giveCards(ArrayList<Card> cardsRecieved) {
		//for(Card card : cardsRecieved) {
		playerDeck.addCards(cardsRecieved);
		//}
	}
	
	public void printDeck(){
		playerDeck.showCards();
	}
}
