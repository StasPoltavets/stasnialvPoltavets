package HomeWorkException;

public class NotFoundPlayers extends RuntimeException{
    public NotFoundPlayers(int CheckPlayerCount) {
        super("Недостатньо гравців" + CheckPlayerCount);
    }
}
