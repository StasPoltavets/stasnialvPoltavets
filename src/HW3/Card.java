package HW3;

public class Card {
    private String ranks;
    private String suits;

    public Card(String ranks, String suits) {
        this.ranks = ranks;
        this.suits = suits;
    }
    public String getRanks() {
        return ranks;
    }
    public String getSuits() {
        return suits;
    }

    @Override
    public String toString () {
        return this.ranks + " " +this.suits;
    }
}
