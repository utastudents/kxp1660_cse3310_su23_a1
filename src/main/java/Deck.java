import enums.Rank;
import enums.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a deck of cards.
 * cards attribute holds 52 unique cards and represent a deck of playing card.
 * Each card in the deck belongs to a class Card.
 * This Deck of card is used to deal the cards for each player playing Poker.
 */
public class Deck {

    /*
    Considered using List because list is an ordered collection of items which is index based.
    List allows us to insert and remove item at a particular index.
    The deck must support two actions Shuffle and Deal Cards.
    The shuffle action is removing a card at random index and inserting a card at random index between 0 and 51.
    The Deal actions is removing the card from the top of the deck.
    This both actions can be implemented using List.
     */
    private List<Card> cards;

    Deck() {
        this.cards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Shape shape : Shape.values()) {
                Card card = new Card(rank, shape);
                this.cards.add(card);
            }
        }
    }

    public List<Card> getCards() {
        return this.cards;
    }
}
