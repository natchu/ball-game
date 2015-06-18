/**
 * Created by natchup on 18/06/15.
 */
public class Colour {

    public static final int BLUE = 1;
    public static final int GREEN = 2;
    public static final int RED = 3;
    public static final int YELLOW = 4;

    private int colour;

    @Override
    public String toString() {
        if (colour == 1)
            return "Blue";
        if (colour == 2)
            return "Green";
        if (colour == 3)
            return "Red";
        if (colour == 4)
            return "Yellow";
        return super.toString();
    }
}
