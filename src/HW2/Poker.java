package HW2;

import java.util.Random;

public class Poker {

    private static int  nnOfCards = 54;
    private static int noOfPlayers = 2;

    private static String[] cards = new String[nnOfCards];

    public static void main(String[] args) {
    createDeck();
    shuffleDeck();
    serveCards();
    }

    private static void createDeck () {
        String[] suites = {"Піка", "Бубна", "Чирва", "Трефа"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};

        int index = 0;
        for (String suit: suites) {
            for (String rank : ranks){
                cards[index++] = rank + " " + suit;
            }
        }
    }
    private static void shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i<150; i++){
            int in =random.nextInt(nnOfCards);
            int out = random.nextInt(noOfPlayers);

            String tmpCard = cards[in];
            cards[in] = cards[out];
            cards[out] = tmpCard;
        }
    }
    private static void serveCards (){
        int index =0;
        for (int round = 1; round <=5; round++){
            System.out.println("Round "+ round);
            for (int player = 1; player<= noOfPlayers; player++){

                System.out.println(String.format("Гравець %d отримує карту %s%n ",player, cards[index++]));
            }
            System.out.println("");
        }
    }
}
