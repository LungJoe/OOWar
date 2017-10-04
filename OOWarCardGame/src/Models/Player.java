package Models;

public class Player {
	private String playerName;
	private Deck playerDeck;

	public Player(){
		playerDeck = new Deck();
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Deck getPlayerDeck() {
		return playerDeck;
	}
}
