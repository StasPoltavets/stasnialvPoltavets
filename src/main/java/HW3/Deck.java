package HW3;

import HomeWork8.ConsoleColors;

import java.nio.charset.StandardCharsets;

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

        try {
            return deck[r];
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println(ConsoleColors.RED +"Більше ніж потрібно");

        } finally {
            System.out.println("finally block exception");
        }
        return null;
    }
    public void setCard(int index, Card card) {
        deck[index] = card;
    }
}