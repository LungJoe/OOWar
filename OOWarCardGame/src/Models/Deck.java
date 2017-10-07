package Models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	String[] suits = { "HEARTS", "SPADES", "CLUBS", "DIAMONDS" };
	ArrayList<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>();
		createOrderedDeck();
	}

	private void createOrderedDeck() {
		for (int i = 0; i < suits.length; i++) {
			for (int j = 2; j <= 14; j++) {
				cards.add(new Card(suits[i], j));
			}
		}
	}

	public void clearDeck() {
		cards.clear();
	}
	
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}

	public ArrayList<Card> getDeck() {
		return cards;
	}

	public ArrayList<Card> getShuffledDeck() {
		Collections.shuffle(cards);
		return cards;
	}

	public void showCards() {
		for (Card card : cards) {
			System.out.println(card);
		}
	}

	public Card getNextCard() {
		return cards.remove(0);
	}

	public void addCards(ArrayList<Card> newCards) {
		cards.addAll(newCards);
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public Deck split() {
		Deck subDeck = new Deck();
		ArrayList<Card> halfStackOfDeck = new ArrayList<Card>();
		for (int i = 0; i < 26; i++) {
			halfStackOfDeck.add(cards.remove(i));
		}
		subDeck.setCards(halfStackOfDeck);
		return subDeck;
	}

	public void addCard(Card card) {
		cards.add(card);
	}

}
