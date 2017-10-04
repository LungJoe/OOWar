package Models;

import java.util.ArrayList;

public class WarGame {

    ArrayList<Player> players;
    ArrayList<Card> currentPlayCards;
    Pile playPile;
    Pile warPile;
    

    public WarGame(Player...newPlayers ) {
    	players = new ArrayList<Player>();
    	currentPlayCards = new ArrayList<Card>();
    	playPile = new Pile();
    	warPile = new Pile();
    	for(Player player: newPlayers) {
    		players.add(player);
    	}
    }

    public void playGame() {
    	int remainingPlayers = players.size();
    	while(remainingPlayers > 1) {
    		setCurrentPlayCards();
    		int winner = CompareCards.CompareTwoCards(playPile);
    		if(winner != -2){
    		    players.get(winner).addCardsToDeck(playPile.getPile());
    		    setNextTurn();
    		} else {
    		    war();
    		}
    	}
    }
    
    public void war() {
    	for(Player player: players) {
    	    warPile.addOntoPile(player.getNextCard());
    	}
    	//needs more logic
    }
    
    public void setCurrentPlayCards() {
	for(Player player: players) {
	    playPile.addOntoPile(player.getNextCard());
	}
    }
    
    private void setNextTurn() {
	playPile.clearPile();
	setCurrentPlayCards();
    }
    
    public Player getPlayerByIndex(int index) {
    	return players.get(index);
    }

    public void setPlayerByIndex(int index, Player player) {
    	players.set(index, player);
    }
}
