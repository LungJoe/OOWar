package Controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import View.*;

public class Driver {
	public static GameController gameController;
	public static LoggerTwoPlayer logger = new LoggerTwoPlayer();
	public static int gameType;
	
	public static void main(String args[]){
		switch(pickGameType()){
		case 1:
			gameController = new Game1Controller();
			((Game1Controller) gameController).inputPlayerNames();
			((Game1Controller) gameController).deckController.dealDeck();
			((Game1Controller) gameController).playGame();
			break;
		case 2:
			gameController = new Game2Controller();
			((Game2Controller) gameController).inputPlayerNames();
			((Game2Controller) gameController).deckController.dealDeck();
			((Game2Controller) gameController).playGame();
			break;
		case 3:
			gameController = new Game3Controller();
			((Game3Controller) gameController).inputPlayerNames();
			((Game3Controller) gameController).deckController.dealDeck();
			((Game3Controller) gameController).playGame();
			break;
		}
	}
	
	public static int pickGameType(){
		BufferedReader playerInput = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("***WAR***" +
				"\n1.) Placing won cards on the bottom of the player’s hand. Winner is" +
				"\n    player with most cards in hand at end of game." +
				"\n2.) Placing won cards in a separate points pile. Winner is player" +
				"\n    with most cards in points pile at end of game." +
				"\n3.) 3-player war placing won cards in a separate points pile." +
				"\n    Winner is player with most cards in points pile at end of game" +
				"\n\nSelect Game Type: ");
		
		try {
			gameType = Integer.parseInt(playerInput.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if((gameType < 1) || (gameType > 3))
		{
			System.err.print("Please select a valid game type\n");
			pickGameType();
		}
		return gameType;
	}
}
