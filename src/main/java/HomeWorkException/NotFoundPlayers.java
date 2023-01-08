package HomeWorkException;

import static HomeWorkException.PokerException.players;

public class NotFoundPlayers extends RuntimeException{
    public NotFoundPlayers(String не_достатньо_гравців) {
            System.out.println(ConsoleColors.CYAN_BACKGROUND +"Не достатньо гравців за столом");
       // super(ConsoleColors.GREEN_UNDERLINED +"Не достатньо гравців за столом");
    }
}
