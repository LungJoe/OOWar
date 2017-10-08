package Models;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class WarTest {
	
	Deck deck = new Deck();
    ArrayList<Card> deckOfCards = new ArrayList<Card>();
	
    @Test
    public void testTwoCardsInWarVarient1() {
        ArrayList<Card> fixeddeck = new ArrayList<Card>(Arrays.asList(
                new Card("Hearts", 2),
                new Card("Hearts", 3)));
        Players jake = new Players("Jake");
        Players bob = new Players("Bob");
        WarVarient1 game = new WarVarient1(jake, bob, fixeddeck);

        assertEquals(bob.getName(), game.playGame().getName());
    }
    
    @Test
    public void testThreeCardsInWarVarient3(){
        ArrayList<Card> fixeddeck = new ArrayList<Card>(Arrays.asList(
                new Card("Hearts", 2),
                new Card("Hearts", 3),
                new Card("Hearts", 4)));
        Players jake = new Players("Jake");
        Players bob = new Players("Bob");
        Players seymour = new Players("Seymour");
        WarVarient3 game = new WarVarient3(jake, bob ,seymour, fixeddeck);
        
        assertEquals(seymour.getName(), game.playGame().getName());  	
    }
    
    @Test
    public void testDrawInWarVarient3(){
        ArrayList<Card> fixeddeck = new ArrayList<Card>(Arrays.asList(
                new Card("Hearts", 2),
                new Card("Hearts", 4),
                new Card("Hearts", 4),
                new Card("Spades", 3),
                new Card("Spades", 2),
                new Card("Spades", 2)));
        Players jake = new Players("Jake");
        Players bob = new Players("Bob");
        Players seymour = new Players("Seymour");
        WarVarient3 game = new WarVarient3(jake, bob ,seymour, fixeddeck);
        
        assertEquals(jake.getName()+ " " + bob.getName(), game.playGame().getName());  	
    	
    }
    
    @Test
    public void testDrawInWarVarient2(){
        ArrayList<Card> fixeddeck = new ArrayList<Card>(Arrays.asList(
                new Card("Hearts", 2),
                new Card("Hearts", 4),
                new Card("Spades", 4),
                new Card("Spades", 2)));
        Players jake = new Players("Jake");
        Players bob = new Players("Bob");
        WarVarient2 game = new WarVarient2(jake, bob ,fixeddeck);
        
        assertEquals(jake.getName() + " " + bob.getName(),  game.playGame().getName());  	
    }
    
    @Test
    public void testTwelveCardsInWarVarient2() {
        ArrayList<Card> fixeddeck = new ArrayList<Card>(Arrays.asList(
                new Card("Hearts", 1),
                new Card("Hearts", 2),
                new Card("Hearts", 3),
                new Card("Hearts", 4),
                new Card("Hearts", 5),
                new Card("Hearts", 6),
                new Card("Hearts", 7),
                new Card("Hearts", 8),
                new Card("Hearts", 9),
                new Card("Hearts", 10),
                new Card("Hearts", 11),
                new Card("Hearts", 12)));
        Players jake = new Players("Jake");
        Players bob = new Players("Bob");
        WarVarient2 game = new WarVarient2(jake, bob, fixeddeck);

        assertEquals(bob.getName(), game.playGame().getName());
    }
    
    @Test
    public void testTwelveCardsInWarVarient3() {
        ArrayList<Card> fixeddeck = new ArrayList<Card>(Arrays.asList(
                new Card("Hearts", 2),
                new Card("Hearts", 3),
                new Card("Hearts", 4),
                new Card("Hearts", 5),
                new Card("Hearts", 6),
                new Card("Hearts", 7),
                new Card("Hearts", 8),
                new Card("Hearts", 9),
                new Card("Hearts", 10),
                new Card("Hearts", 11),
                new Card("Hearts", 12),
                new Card("Hearts", 13)));
        Players jake = new Players("Jake");
        Players bob = new Players("Bob");
        Players seymour = new Players("Seymour");
        WarVarient3 game = new WarVarient3(jake, bob,seymour ,fixeddeck);

        assertEquals(seymour.getName(), game.playGame().getName());
    }
    
    @Test
    public void testEmptyDeckInWarVarient1() {
        ArrayList<Card> fixeddeck = new ArrayList<Card>();
        Players jake = new Players("Jake");
        Players bob = new Players("Bob");
        WarVarient1 game = new WarVarient1(jake, bob, fixeddeck);

        assertEquals(jake.getName() + " "+ bob.getName(), game.playGame().getName());
    }

    
    @Test
    public void testEmptyDeckInWarVarient2() {
        ArrayList<Card> fixeddeck = new ArrayList<Card>();
        Players jake = new Players("Jake");
        Players bob = new Players("Bob");
        WarVarient2 game = new WarVarient2(jake, bob, fixeddeck);

        assertEquals(jake.getName() + " "+ bob.getName(), game.playGame().getName());
    }

    @Test
    public void testEmptyDeckInWarVarient3() {
        ArrayList<Card> fixeddeck = new ArrayList<Card>();
        Players jake = new Players("Jake");
        Players bob = new Players("Bob");
        Players seymour = new Players("Seymour");
        WarVarient3 game = new WarVarient3(jake, bob, seymour, fixeddeck);

        assertEquals(jake.getName() + " "+ bob.getName()+ " " + seymour.getName(), game.playGame().getName());
    }
    @Test
    public void testfullDrawInWarVarient3() {
        ArrayList<Card> fixeddeck = new ArrayList<Card>(Arrays.asList(
                new Card("Hearts", 2),
                new Card("Hearts", 7),
                new Card("Hearts", 13),
                new Card("Hearts", 5),
                new Card("Hearts", 12),
                new Card("Hearts", 3),
                new Card("Hearts", 11),
                new Card("Hearts", 6),
                new Card("Hearts", 4)));;
        Players jake = new Players("Jake");
        Players bob = new Players("Bob");
        Players seymour = new Players("Seymour");
        WarVarient3 game = new WarVarient3(jake, bob, seymour, fixeddeck);

        assertEquals(jake.getName() + " "+ bob.getName()+ " " + seymour.getName(), game.playGame().getName());
    }


}
