import java.util.*;

public class Main {
    public static void main(String[] args) {
        CardsDeck deck = new CardsDeck();
        ArrayList<Card> cards = deck.getCards();
        for (Card card: cards) {
            System.out.println(card.toString());
        }
    }
}