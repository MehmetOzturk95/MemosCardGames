public class IDeclareWarDriver {
    public static void main(String[] args) {
        Deck h1 = new Deck();
        h1.init();
        h1.shuffle();
        
        Deck h2 = new Deck();
        
        for(int i = 0; i < 26; i++) {
            Card c = h1.drawTopCard();
            h2.addCardToTop(c);
        }
    }
}
