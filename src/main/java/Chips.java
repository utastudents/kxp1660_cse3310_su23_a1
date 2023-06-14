/*
Represent the chips used to play poker.
points attribute holds the info for the total chip points the player has.
 */
public class Chips {

    private int points;

    Chips() {
        points = 10000;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
