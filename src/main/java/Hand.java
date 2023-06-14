import java.util.ArrayList;
import java.util.List;

/*
Represents the cards for each player
hand attribute holds the info of the list of cards the player holds for a particular round of Poker.
Each card in the handCards belongs to the class Card
 */
public class Hand {

    private List<Card> handCards;

    Hand() {
        this.handCards = new ArrayList<>();
    }

    public List<Card> getHandCards() {
        return this.handCards;
    }

    public void setHandCards(Card hanCard) {
        this.handCards.add(hanCard);
    }
}
