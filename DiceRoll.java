import java.util.Random;
public class DiceRoll {
    private Random random;

    public DiceRoll() {
        random = new Random();
    }

    public int roll() {
        return random.nextInt(6) + 1; // Random number between 1 and 6
    }
}
