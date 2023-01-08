package HomeWorkException;


import java.util.Random;

public class PokerException {
    private static int cardsPerPlayer = 52;
    public static int players = 2;

    private static String[] cards = new String[cardsPerPlayer];

    public static void main(String[] args) throws NotFoundPlayers {
        startDeck();
        startShuffle();
        startDisplay();
    }

    private static void startDeck (){
        String[] suits = {"Піка", "Бубна", "Чирва", "Трефа"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};

        int index = 0;
        for (String suit: suits) {
            for (String rank: ranks){
                cards[index++] = rank + " " + suit;
            }
        }
    }
    public static void startShuffle () throws NotFoundPlayers {
        Random random = new Random();
        for (int i = 0; i < 150; i++) {
            int r = random.nextInt(cardsPerPlayer);
            int s =random.nextInt(players);


            if (players <= 1) {                                     // прокинув ексепшин на недостатність графців
                throw new NotFoundPlayers("Не достатньо гравців");
            }

            String temp = cards[r];
            cards[r] = cards[s];
            cards[s] = temp;

           // throw new NotFoundPlayers();

        }
    }
    private static void startDisplay (){
        try {
            int index =0;
            for (int round = 1; round <=5; round++){
                System.out.println("Роздача "+ round);
                for (int player = 1; player<= players; player++){

                    System.out.println(String.format("Гравець %d отримує карту %s%n ",player, cards[index++]));
                }
                System.out.println("");
            }
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(ConsoleColors.BLUE_UNDERLINED + "Не достатньо карт карт для продовженя гри");
            arrayIndexOutOfBoundsException.printStackTrace();
        } finally {
            System.out.println("Завершення гри");

        }

    }
}
