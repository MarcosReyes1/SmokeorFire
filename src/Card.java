public class Card {
    private Suits mSuit;
    private Ranks mRank;

    public Card(Suits suit, Ranks rank) {
        this.mSuit = suit;
        this.mRank = rank;
    }

    public Suits getSuit() {
        return mSuit;
    }

    public Ranks getRank() {
        return mRank;
    }

    public String toString() {
        return "Card [suit=" + getSuit() + ", rank=" + getRank() + "]";
    }
}

