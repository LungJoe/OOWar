package Models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	public ArrayList<Card> cards;
	
	public Deck(){
		cards = new ArrayList<Card>();
	}
	
	public void printDeck(){
		for(Card i : this.cards){
			System.out.println(i.getName() + " of " + i.getSuit());
		}
	}
	
	public void shuffleDeck(){
		Collections.shuffle(this.cards);
	}
}
