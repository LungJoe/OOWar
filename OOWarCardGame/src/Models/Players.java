package Models;

import java.util.ArrayList;

public class Players {
	String name;
	int score;
	ArrayList<Card> playerDeck;

	public Players(String name) {
		playerDeck = new ArrayList<Card>();
		this.name = name;
		score = 0;
	}

	public Card drawCard() {
		try{
			return playerDeck.remove(0);
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
		return playerDeck.size();
	}
	
	public void setScore(int newScore) {
		score = newScore;
	}

	public void giveCards(ArrayList<Card> cardsRecieved) {
		for(Card card : cardsRecieved) {
			playerDeck.add(card);
		}
	}
	
	public void printDeck(){
		for(Card card: playerDeck){
			System.out.println(card);
		}
	}
}
