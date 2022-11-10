package HW3;

import java.util.Random;

public class PokerHw {
    private static int cardsPerPlayer = 54;
    private static int players = 2;

    private static String[] cards = new String[cardsPerPlayer];

    public static void main(String[] args) {
        desk();
        shuffle();
        display();
    }

    private static void desk (){
        String[] suits = {"Піка", "Бубна", "Чирва", "Трефа"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};

        int index = 0;
        for (String suit: suits) {
            for (String rank : ranks){
                cards[index++] = rank + " " + suit;
            }
        }
    }
    private static void shuffle () {
        Random random = new Random();
        for (int i = 0; i < 150; i++) {
            int r = random.nextInt(cardsPerPlayer);
            int s =random.nextInt(players);

            String temp = cards[r];
            cards[r] = cards[s];
            cards[s] = temp;
        }
    }
    private static void display (){
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