package Models;

import java.util.ArrayList;

public class Pile {
    ArrayList<Card> pile;
    
    public Pile() {
	pile = new ArrayList<Card>();
    }
    
    public void addOntoPile(Card card) {
	pile.add(card);
    }
    
    public void clearPile() {
	pile.clear();
    }
}
