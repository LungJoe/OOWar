package Driver;

import Models.*;

public class Driver {
    public static void main(String[] args) {
	Player one = new Player("Jack");
	Player two = new Player("Jessica");
	
	WarGame war = new WarGame(one, two);
	one.getDeck().showCards();
	
	//System.out.println(one.getDeck().getCards().sort());
    }
}
