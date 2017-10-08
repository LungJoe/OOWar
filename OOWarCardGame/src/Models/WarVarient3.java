package Models;

import java.util.ArrayList;

public class WarVarient3 implements WarInterface {

	int compareValue;
	Players player1, player2, player3, winner;
	Card player1Upcard, player2Upcard, player3Upcard;
	ArrayList<Card> player1Deck, player2Deck, player3Deck, gameDeck, downPile;
	CompareCards comparer;
	Logger log;

	public WarVarient3(Players player1, Players player2, Players player3, ArrayList<Card> deck) {
		this.player1 = player1;
		this.player2 = player2;
		this.player3 = player3;
		gameDeck = deck;

		player1Deck = new ArrayList<Card>();
		player2Deck = new ArrayList<Card>();
		player3Deck = new ArrayList<Card>();

		downPile = new ArrayList<Card>();
		comparer = new CompareCards();
		log = new Logger();
	}

	public void splitDeck() {
		int deckSize = gameDeck.size();

		while (deckSize % 3 != 0) {
			gameDeck.remove(0);
			deckSize = gameDeck.size();
		}
		int playerDeckSize = deckSize / 3;

		for (int i = 0; i < playerDeckSize; i++) {
			player1Deck.add(gameDeck.get(i));
			player2Deck.add(gameDeck.get(playerDeckSize + i));
			player3Deck.add(gameDeck.get((2 * playerDeckSize) + i));
		}
	}

	public void dealCardsToPlayers() {
		splitDeck();
		player1.giveCards(player1Deck);
		player2.giveCards(player2Deck);
		player3.giveCards(player3Deck);
	}

	public void setUpRound() {
		player1Upcard = player1.drawCard();
		player2Upcard = player2.drawCard();
		player3Upcard = player3.drawCard();
		downPile.add(player1Upcard);
		downPile.add(player2Upcard);
		downPile.add(player3Upcard);
	}

	public void setUpWar() {
		downPile.add(player1.drawCard());
		downPile.add(player2.drawCard());
		downPile.add(player3.drawCard());
	}

	public Players war() {
		Players warWinner;
		log.war();
		try {
			setUpWar();
			setUpRound();
			warWinner = determineRoundWinner();
		} catch (NullPointerException e) {
			return null;
		}
		return warWinner;
	}

	public Players determineRoundWinner() {
		log.initialDraw(player1Upcard, player2Upcard, player3Upcard);
		compareValue = comparer.CompareThreeCards(player1Upcard, player2Upcard, player3Upcard);

		if (compareValue == 1) {
			log.roundWinner(player1);
			return player1;
		} else if (compareValue == 2) {
			log.roundWinner(player2);
			return player2;
		} else if (compareValue == 3) {
			log.roundWinner(player3);
			return player3;
		} else if (compareValue == 4) {
			return war();
		} else
			return null;
	}

	public Players determineGameWinner() {
		int player1Score = player1.getScore();
		int player2Score = player2.getScore();
		int player3Score = player3.getScore();

		// A single winner
		if (player1Score > player2Score && player1Score > player3Score){
			log.gameWinner(player1);
			return player1;
		}
		else if (player2Score > player1Score && player2Score > player3Score){
			log.gameWinner(player2);
			return player2;
		}
		else if (player3Score > player2Score && player3Score > player2Score){
			log.gameWinner(player3);
			return player3;
		}
		// A draw between 2 or more players
		else if (player1Score == player2Score && player1Score == player3Score){
			log.fullDraw();
			return new Players (player1.getName() + " " + player2.getName() + " " + player3.getName());
		}
		else if (player1Score == player2Score){
			log.draw(player1, player2);
			return new Players (player1.getName() + " " +player2.getName());
		}
		else if (player1Score == player3Score){
			log.draw(player2, player3);
			return new Players (player1.getName() + " " +player3.getName());
		}
		else{
			log.draw(player2, player3);
			return new Players (player2.getName() + " " + player3.getName());
		}
	}

	public void awardWinner() {
		winner.addScore(downPile.size());
	}

	public Players playGame() {
		log.setPlayers(player1, player2, player3);
		dealCardsToPlayers();

		while (player1.hasCards() && player2.hasCards() && player3.hasCards()) {
			setUpRound();
			winner = determineRoundWinner();
			if (winner == null)
				break;

			awardWinner();
			log.currentScore(player1.getScore(), player2.getScore(), player3.getScore());
			downPile.clear();
		}
		return determineGameWinner();
	}
}
