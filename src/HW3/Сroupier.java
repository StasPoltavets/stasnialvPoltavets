package HW3;

import java.util.Random;

public class Сroupier {
    private int players = 5;

    public Deck startDeck(){
        String[] suits = {"Піка", "Бубна", "Чирва", "Трефа"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};

        Deck deck = new Deck();
        for (String suit: suits) {
            for (String rank : ranks){
                Card card = new Card(rank, suit);
                deck.addCard(card);
            }
        }
        return deck;
    }
    public void startShuffle (Deck deck) {
        Random random = new Random();
        for (int i = 0; i < 150; i++) {
            int r = random.nextInt(52);
            int s =random.nextInt(52);

            Card tmpCard = deck.getCard(r);
            deck.setCard(r, deck.getCard(s));
            deck.setCard(s, tmpCard);
        }
    }
    public void servCard (int cardsPerPlayer, Deck deck) {
        int index =0;
        for (int round = 1; round <=5; round++){
            System.out.println("Роздача "+ round);
            for (int player = 1; player<= players; player++){

                System.out.println(String.format("Гравець %d отримує карту %s%n ",player, deck.getCard(index++)));
            }
            System.out.println("");
        }
    }


}
