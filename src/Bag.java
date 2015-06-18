import java.util.List;
import java.util.Random;

/**
 * Created by natchup on 18/06/15.
 */
public class Bag {

    List<Ball> ballList;

    public void printSummary()
    {
        for(Ball ball : ballList)
        {
            System.out.println(ball);
        }
    }

    public int generateBallColour()
    {
        Random randomGenerator = new Random();
        Colour ballColour = new Colour(randomGenerator.nextInt(4) + 1);
        return ballColour.valueOf();
    }

    public void addBall()
    {
        Colour ballColour = new Colour(generateBallColour());
        if(ballColour.equals(Colour.BLUE))
        {
            if(count(Colour.BLUE) == 3)
                ballColour = new Colour(generateBallColour());
        }
        ballList.add(new Ball(ballColour));

    }

    private int count(int colourVal)
    {
        int ballCount = 0;
        Colour colour = new Colour(colourVal);
        for(Ball ball : ballList)
        {
            if(ball.getColour() == colour)
                ballCount ++;
        }
        return ballCount;
    }
}
