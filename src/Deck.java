import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;
    
    public Deck() {
        cards = new ArrayList<Card>(52);
    }
    
    public Card drawTopCard() {
        return cards.remove(0);
    }
    
    public Card drawCardAtRandom() {
        if (cards.size() == 0) {
            return null;
        }
        
        return cards.remove(getRandomIndex());
    }
    
    public void addCardToTop(Card c) {
        cards.add(0, c);
    }
    
    public void insertCardAtRandom(Card c) {
        cards.add(getRandomIndex(), c);
    }
    
    public void shuffle() {
        for (int c = 0; c <= cards.size(); c++) {
            insertCardAtRandom(drawCardAtRandom());
        }
    }
    
    public int getNumberOfCards() {
        return cards.size();
    }
    
    public boolean isEmpty() {
        return cards.size() == 0;
    }
    
    public void init() {
        for (char suit = 3; suit <= 6; suit++) {
            for(int value = 2; value <= 14; value++) {
                cards.add(new Card(suit, value));
            }
        }
    }
    
    private int getRandomIndex() {
        return (int)(Math.random() * cards.size());
    }
}
