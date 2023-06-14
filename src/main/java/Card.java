import enums.Rank;
import enums.Shape;

/*
Represents the playing cards.
rank attribute holds the rank info for the card.
shape attribute holds the shape info for the card.
 */
public class Card {

    private Rank rank;
    private Shape shape;

    Card(Rank rank, Shape shape) {
        this.rank = rank;
        this.shape = shape;
    }

    public Rank getRank() {
        return rank;
    }

    public Shape getShape() {
        return shape;
    }
}
