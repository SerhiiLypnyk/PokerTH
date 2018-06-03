package logic;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private static Random rnd = new Random();

    private ArrayList<Card> deck;
    private int n;

    public Deck() {
        deck = new ArrayList<Card>();
        n = 0;
        refill();
        shuffle();
    }

    public void shuffle() {
        for (int i=0; i<52; i++) {
            swap(i, rnd.nextInt(52));
        }
    }

    private void swap(int i, int j) {
        Card tmp = deck.get(i);
        deck.set(i, deck.get(j));
        deck.set(j, tmp);
    }

    private void refill() {
        for (int i=0; i<52; i++) {
            deck.add(new Card(i));
        }
    }

    public Card getByNumber(int n) {
        return deck.get(n);
    }

    public void print() {
        for(Card c: deck)
            System.out.println(c);
    }

    public Card getNextCard() {
        return deck.get(n++);
    }
}
