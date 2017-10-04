package Driver;

import Models.*;

public class Driver {
    public static void main(String[] args) {
	Player Jack = new Player("Jack");
	Player Jessica = new Player("Jessica");
	
	WarGame war = new WarGame(Jack, Jessica);
	Jack.showDeck();
	
	//war.plauGame();
    }
}
