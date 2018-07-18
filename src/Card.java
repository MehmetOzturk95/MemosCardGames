public class Card {
    private char suit;
    private int value; // 2-10, J=11, Q=12, K=13, A=14
    private boolean faceUp;
    
    public Card(char suit, int value) {
        this.suit = suit;
        this.value = value;
    }
    
    public char getSuit() {
        return suit;
    }
    
    public int getValue() {
        return value;
    }
    
    public boolean isFaceUp() {
        return faceUp;
    }
    
    public boolean isFaceDown() {
        return !faceUp;
    }
    
    public void flip() {
        faceUp = !faceUp;
    }
    
    public String toString() {
        return Card.getCanonicalValue(value) + " of " + Card.getCanonicalSuit(suit);
    }
    
    private static String getCanonicalValue(int value) {
        if (value <= 10)
            return "" + value;
        if (value == 11)
            return "JACK";
        if (value == 12)
            return "QUEEN";
        if (value == 13)
            return "KING";
        return "ACE";
    }
    
    private static String getCanonicalSuit(char suit) {
        // TODO Return actual suit characters
        if (suit == 3)
            return "HEARTS";
        if (suit == 4)
            return "DIAMONDS";
        if (suit == 5)
            return "CLUBS";
        return "SPADES";
    }
    
    public int compareTo(Card other) {
        if (this.value < other.value) {
            return -1;
        }
        if (this.value > other.value) {
            return 1;
        }
        return 0;
    }
}
