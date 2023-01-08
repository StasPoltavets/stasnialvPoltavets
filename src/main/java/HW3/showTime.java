package HW3;

public class showTime {
    public static void main(String[] args) {
        Сroupier croupier = new Сroupier();
        Deck deck = croupier.startDeck();

        croupier.startShuffle(deck);
             croupier.servCard(5, deck);

    }
}
