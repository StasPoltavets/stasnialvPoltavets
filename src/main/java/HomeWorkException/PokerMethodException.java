package HomeWorkException;

public class PokerMethodException {

    public void CheckPlayerCount (int players) throws NotFoundPlayers {
        try{
            if (players <= 1) {
               throw new RuntimeException(String.valueOf(players));
            }
        }catch (NotFoundPlayers notFoundPlayers) {
            System.out.println(ConsoleColors.GREEN_UNDERLINED + "не вистачає гравців для початку гри");
        }
    }


}
