package Models;

public interface WarInterface {
	
	public void splitDeck();

    public void dealCardsToPlayers();

    public void setUpRound();
        
    public void setUpWar();
    
    public Players war();
    
    public Players determineRoundWinner();

    public Players determineGameWinner();
    
    public void awardWinner();

    public Players playGame();

}
