package Models;

public class Game {

    Player playerOne;
    Player playerTwo;
    Player playerThree;

    public Game(Player playerOne, Player playerTwo, Player playerThree) {
	this.playerOne = playerOne;
	this.playerTwo = playerTwo;
	this.playerThree = playerThree;
    }

    public Player getPlayerOne() {
	return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
	this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
	return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
	this.playerTwo = playerTwo;
    }

    public Player getPlayerThree() {
	return playerThree;
    }

    public void setPlayerThree(Player playerThree) {
	this.playerThree = playerThree;
    }

}
