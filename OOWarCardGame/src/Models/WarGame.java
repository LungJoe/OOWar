package Models;

import java.util.ArrayList;

public class WarGame {

    ArrayList<Player> players;

    public WarGame(Player...newPlayers ) {
    	players = new ArrayList<Player>();
    	for(Player player: newPlayers) {
    		players.add(player);
    	}
    }

    public void playGame() {
    	int remainingPlayers = players.size();
    	while(remainingPlayers > 1) {
    		
    	}
    }
    
    public void war() {
    	
    }
    
    public Player getPlayerByIndex(int index) {
    	return players.get(index);
    }

    public void setPlayerByIndex(int index, Player player) {
    	players.set(index, player);
    }
}
