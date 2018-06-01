package logic;

public class Card {
    private Suit suit;
    private short rank;

    private static char[] ranks = {'A', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'J', 'Q', 'K'};

    public Card(Suit suit, short rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "" + rank + suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public short getRank() {
        return rank;
    }
}
