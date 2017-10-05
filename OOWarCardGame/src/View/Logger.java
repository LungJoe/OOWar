package View;

import Controllers.*;
import Models.Card;

public interface Logger {
	
	public void logRound(DeckController deckController, Card cardPlayer1, Card cardPlayer2);	
	public void logScore(GameController gameController);
	public void logWin(GameController gameController);
}
