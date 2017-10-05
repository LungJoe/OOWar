package Models;

import java.util.ArrayList;

public class Pile {
	private ArrayList<Card> pile;

	public Pile() {
		pile = new ArrayList<Card>();
	}

	public void addOntoPile(Card card) {
		pile.add(card);
	}

	public ArrayList<Card> getPile() {
		return pile;
	}

	public void clearPile() {
		pile.clear();
	}
}
