import java.util.Random;

// Class for generating random numbers.
public class RandomGen {
    private Random rand = new Random();

    public int randgen() {
        return rand.nextInt(50); 
    }
}
