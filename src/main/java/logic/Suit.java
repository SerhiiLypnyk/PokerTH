package logic;

public enum Suit {
    HEARTS {
        @Override
        public String toString() {
            return "H";
        }
    }, SPADES {
        @Override
        public String toString() {
            return "S";
        }
    }, DIAMONDS {
        @Override
        public String toString() {
            return "D";
        }
    }, CLUBS {
        @Override
        public String toString() {
            return "C";
        }
    };
}
