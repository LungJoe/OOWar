package test;

import static org.junit.Assert.*;

import org.junit.*;

import Controllers.*;
import Models.*;

public class TestWar {
	

	public Deck player1Deck = new Deck();
	public Deck player2Deck = new Deck();
	public Deck player3Deck = new Deck();

	public GameController gameController;

	@Test
	public void test1AddTwoPlayer() {
		player1Deck.cards.add(new Card("Hearts", "5"));
		player1Deck.cards.add(new Card("Spades", "4"));
		player1Deck.cards.add(new Card("Hearts", "Ace"));
		
		player2Deck.cards.add(new Card("Diamonds", "3"));
		player2Deck.cards.add(new Card("Diamonds", "9"));
		player2Deck.cards.add(new Card("Clubs", "5"));
	}
	
	@Test
	public void test2AddTwoPlayer() {
		player1Deck.cards.add(new Card("Hearts", "2"));
		player1Deck.cards.add(new Card("Spades", "4"));
		player1Deck.cards.add(new Card("Hearts", "Ace"));
		
		player2Deck.cards.add(new Card("Diamonds", "3"));
		player2Deck.cards.add(new Card("Diamonds", "9"));
		player2Deck.cards.add(new Card("Clubs", "Ace"));
	}
	
	@Test
	public void test1AddTypeThreePlayer() {
		player1Deck.cards.add(new Card("Hearts", "2"));
		player1Deck.cards.add(new Card("Hearts", "3"));
		player1Deck.cards.add(new Card("Spades", "4"));
		
		player2Deck.cards.add(new Card("Hearts", "Jack"));
		player2Deck.cards.add(new Card("Hearts", "6"));
		player2Deck.cards.add(new Card("Diamonds", "9"));
		
		player3Deck.cards.add(new Card("Diamonds", "Jack"));
		player3Deck.cards.add(new Card("Spades", "5"));
		player3Deck.cards.add(new Card("Clubs", "2"));
	}
	
	@Test
	public void test2AddTypeThreePlayer() {
		player1Deck.cards.add(new Card("Hearts", "3"));
		player1Deck.cards.add(new Card("Spades", "4"));
		
		player2Deck.cards.add(new Card("Hearts", "2"));
		player2Deck.cards.add(new Card("Diamonds", "9"));
		
		player3Deck.cards.add(new Card("Spades", "5"));
		player3Deck.cards.add(new Card("Clubs", "2"));
	}
	
	@Test
	public void test1GameType1() {
		gameController = new Game1Controller();
		test1AddTwoPlayer();
		gameController.deckController.player1.setPlayerDeck(player1Deck);
		gameController.deckController.player2.setPlayerDeck(player2Deck);
		assertEquals("Equal",gameController.deckController.player1.getPlayerDeck(), player1Deck);
		assertEquals("Equal",gameController.deckController.player2.getPlayerDeck(), player2Deck);
		((Game1Controller) gameController).inputPlayerNames();
		((Game1Controller) gameController).playGame();
	}
	
	@Test
	public void test1GameType2() {
		gameController = new Game2Controller();
		test1AddTwoPlayer();
		gameController.deckController.player1.setPlayerDeck(player1Deck);
		gameController.deckController.player2.setPlayerDeck(player2Deck);
		assertEquals("Equal",gameController.deckController.player1.getPlayerDeck(), player1Deck);
		assertEquals("Equal",gameController.deckController.player2.getPlayerDeck(), player2Deck);
		((Game2Controller) gameController).inputPlayerNames();
		((Game2Controller) gameController).playGame();
	}
	
	@Test
	public void test1GameType3() {
		gameController = new Game3Controller();
		test1AddTypeThreePlayer();
		((Game3Controller)gameController).deckController.player1.setPlayerDeck(player1Deck);
		((Game3Controller)gameController).deckController.player2.setPlayerDeck(player2Deck);
		((Game3Controller)gameController).deckController.player3.setPlayerDeck(player3Deck);
		assertEquals("Equal",((Game3Controller) gameController).deckController.player1.getPlayerDeck(), player1Deck);
		assertEquals("Equal",((Game3Controller) gameController).deckController.player2.getPlayerDeck(), player2Deck);
		assertEquals("Equal",((Game3Controller) gameController).deckController.player3.getPlayerDeck(), player3Deck);
		((Game3Controller) gameController).inputPlayerNames();
		((Game3Controller) gameController).playGame();
	}
	
	@Test
	public void test2GameType1() {
		gameController = new Game1Controller();
		test2AddTwoPlayer();
		gameController.deckController.player1.setPlayerDeck(player1Deck);
		gameController.deckController.player2.setPlayerDeck(player2Deck);
		assertEquals("Equal",gameController.deckController.player1.getPlayerDeck(), player1Deck);
		assertEquals("Equal",gameController.deckController.player2.getPlayerDeck(), player2Deck);
		((Game1Controller) gameController).inputPlayerNames();
		((Game1Controller) gameController).playGame();
	}
	
	@Test
	public void test2GameType2() {
		gameController = new Game2Controller();
		test2AddTwoPlayer();
		gameController.deckController.player1.setPlayerDeck(player1Deck);
		gameController.deckController.player2.setPlayerDeck(player2Deck);
		assertEquals("Equal",gameController.deckController.player1.getPlayerDeck(), player1Deck);
		assertEquals("Equal",gameController.deckController.player2.getPlayerDeck(), player2Deck);
		((Game2Controller) gameController).inputPlayerNames();
		((Game2Controller) gameController).playGame();
	}
	
	@Test
	public void test2GameType3() {
		gameController = new Game3Controller();
		test2AddTypeThreePlayer();
		((Game3Controller)gameController).deckController.player1.setPlayerDeck(player1Deck);
		((Game3Controller)gameController).deckController.player2.setPlayerDeck(player2Deck);
		((Game3Controller)gameController).deckController.player3.setPlayerDeck(player3Deck);
		assertEquals("Equal",((Game3Controller) gameController).deckController.player1.getPlayerDeck(), player1Deck);
		assertEquals("Equal",((Game3Controller) gameController).deckController.player2.getPlayerDeck(), player2Deck);
		assertEquals("Equal",((Game3Controller) gameController).deckController.player3.getPlayerDeck(), player3Deck);
		((Game3Controller) gameController).inputPlayerNames();
		((Game3Controller) gameController).playGame();
	}

}
