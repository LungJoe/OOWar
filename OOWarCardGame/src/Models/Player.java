package Models;

public class Player {
	private String playerName;
	private Deck playerDeck;

	public Player(){
		setPlayerDeck(new Deck());
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

	public void setPlayerDeck(Deck playerDeck) {
		this.playerDeck = playerDeck;
	}
}
