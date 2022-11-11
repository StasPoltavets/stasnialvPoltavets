package HW3;

import java.util.Random;

public class PokerHw {
    private static int cardsPerPlayer = 52;
    private static int players = 2;

    private static String[] cards = new String[cardsPerPlayer];

    public static void main(String[] args) {
        startDeck();
        startShuffle();
        startDisplay();
    }

    private static void startDeck (){

    }
    private static void startShuffle () {
        Random random = new Random();
        for (int i = 0; i < 150; i++) {
            int r = random.nextInt(cardsPerPlayer);
            int s =random.nextInt(players);

            String temp = cards[r];
            cards[r] = cards[s];
            cards[s] = temp;
        }
    }
    private static void startDisplay (){
        int index =0;
        for (int round = 1; round <=5; round++){
            System.out.println("Роздача "+ round);
            for (int player = 1; player<= players; player++){

                System.out.println(String.format("Гравець %d отримує карту %s%n ",player, cards[index++]));
            }
            System.out.println("");
        }
    }
}