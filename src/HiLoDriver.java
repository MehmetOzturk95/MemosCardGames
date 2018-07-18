public class HiLoDriver {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.init();
        d.shuffle();
        
        int score1 = 0, score2 = 0;
        while (!d.isEmpty()) {
            Card c1 = d.drawTopCard();
            Card c2 = d.drawTopCard();
            System.out.println("You drew " + c1);
            System.out.println("CPU drew " + c2);
            
            int w = c1.compareTo(c2); 
            if(w == -1) {
                score2++;
                System.out.println("CPU wins this round.");
            } else if(w == 1) {
                score1++;
                System.out.println("You win this round.");
            } else {
                System.out.println("This round is a draw.");
            }
            
            System.out.println("Your score is " + score1);
            System.out.println("CPU score is " + score2);
            System.out.println();
        }
    }
}
