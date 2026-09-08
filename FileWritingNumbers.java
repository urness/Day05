import java.io.*;
import java.util.Random;

public class FileWritingNumbers {
    public static void main(String[] args) throws IOException {
        // Create an instance of the Random class
        Random random = new Random();

		// Open a new file for writing
		PrintWriter outputFile = new PrintWriter("Numbers.txt");
		for (int i=0; i<100;i++) {
			//Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
			double myVar = random.nextDouble();
			outputFile.println(myVar);
		}
		outputFile.close();
	}
}