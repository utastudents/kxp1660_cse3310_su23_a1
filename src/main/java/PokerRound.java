import java.util.List;

/*
Represents a single round of poker game
players attribute holds the info for the players playing the game. Each player belongs to the class Player
deck attribute holds the info the deck of cards used to play the round. Each card in the belongs to the class Card.
 */
public class PokerRound {

    private List<Player> players;
    private Deck deck;

    PokerRound(Deck deck, List<Player> players) {
        this.deck = deck;
        this.players = players;
    }

}
