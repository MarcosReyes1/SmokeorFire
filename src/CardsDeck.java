import java.lang.reflect.Array;
import java.util.*;

public class CardsDeck {
    private final ArrayList<Card> cards;

    public CardsDeck() {
        cards = new ArrayList<Card>();
        for (int i = 0; i < Suits.values().length; i++) {
            for (int j = 0; j < Ranks.values().length; j++) {
                this.cards.add(new Card(Suits.values()[i], Ranks.values()[j]));
            }
        }
        //Collections.shuffle(this.cards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
