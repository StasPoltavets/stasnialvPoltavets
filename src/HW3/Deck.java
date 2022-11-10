package HW3;

public class Deck {
    private static int cardsPerPlayer = 52;
    private Card[] deck = new Card[cardsPerPlayer];

    private static int players = 2;

    private int rIndex = 0;
    private int sIndex = 0;
    public void addCard(Card card) {
        if (!(rIndex >= cardsPerPlayer)) {
            deck[sIndex++] = card;
        }
    }

    public Card getCard(int r) {
        return deck[r];
    }
    public void setCard(int index, Card card) {
        deck[index] = card;
    }
}
