public class TestDriver {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.init();
        d.shuffle();
        while (!d.isEmpty()) {
            Card c = d.drawTopCard();
            System.out.println(c);
        }
    }
}
