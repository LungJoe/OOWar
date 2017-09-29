package Controllers;

public class GameController {
	public DeckController deckController;
	
	public GameController(){
		deckController = new DeckController();
	}
	
	public static void main(String args[]){
		new GameController();
	}

}
