package logic;

public class Card {
    private Suit suit;
    private int rank;

    private static char[] ranks = {'A', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'J', 'Q', 'K'};
    private static Suit[] suits = {Suit.HEARTS, Suit.SPADES, Suit.DIAMONDS, Suit.CLUBS};

    public Card(Suit suit, short rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(int n) {
        this.suit = suits[n / 13];
        this.rank = n % 13;
    }

    @Override
    public String toString() {
        return "" + ranks[rank] + suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }
}
