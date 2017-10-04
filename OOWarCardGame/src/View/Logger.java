package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Models.Card;

public class Logger {
	public BufferedReader playerInput;
	public int gameType;
	
	public Logger(){
		playerInput = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public int pickGameType(){
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
	
	public void logRound(Card player1, Card player2){
		
	}
}
