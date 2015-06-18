/**
 * Created by natchup on 17/06/15.
 */
/*
 * A bag can hold a maximum of 12 balls.
 * Balls (blue, green, red or yellow in color) are added to the bag one at a time.
 * No removals. There are some arbitrary rules.
 * Max of 3 green balls. No limit on blue balls.
 * It should be possible to get a summary of the contents of the bag at any time.
 */
public class Ball {

    private Colour colour;

    public Colour getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return colour.toString() + " ball";
    }
}
