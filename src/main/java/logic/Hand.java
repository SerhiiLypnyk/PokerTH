package logic;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;
    private Deck deck;

    public Hand(Deck deck) {
        hand = new ArrayList<Card>();
        this.deck = deck;
    }

    public void getFromDeck() {
        hand.add(deck.getNextCard());
    }
}
