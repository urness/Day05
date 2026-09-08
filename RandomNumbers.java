import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        // Create a Random object
        Random random = new Random();

        // Generate a random integer from 0 to 9
        int number1 = random.nextInt(10);
        System.out.println("Random integer (0-9): " + number1);

        // Generate a random integer from 1 to 100
        int number2 = random.nextInt(100) + 1;
        System.out.println("Random integer (1-100): " + number2);

        // Generate a random double from 0.0 to 1.0
        double decimal = random.nextDouble();
        System.out.println("Random decimal (0.0-1.0): " + decimal);

        // Simulate rolling a six-sided die
        int dieRoll = random.nextInt(6) + 1;
        System.out.println("Die roll: " + dieRoll);

        // Simulate flipping a coin
        int coinFlip = random.nextInt(2); // 0 or 1
        if (coinFlip == 0) {
            System.out.println("Coin flip: Heads");
        } else {
            System.out.println("Coin flip: Tails");
        }
    }
}