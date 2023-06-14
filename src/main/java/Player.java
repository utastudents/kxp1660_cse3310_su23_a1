/*
Represents players playing Poker.
The attributes are
    playerName attribute  holds the name for the player
    playerHand attribute holds the cards for the player. Each card in the player hand belongs to the class Card.
    chips attribute holds the info for the chips owned by the player. The Chip belongs to the class Chips.
 */
public class Player {

    private String playerName;
    private Hand playerHand;
    private Chips chips;

    Player(String playerName) {
        this.playerName = playerName;
        this.playerHand = new Hand();
        this.chips = new Chips();
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }

    public Chips getChips() {
        return chips;
    }
}
