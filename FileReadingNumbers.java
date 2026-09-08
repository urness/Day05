
import java.io.*;
import java.util.Scanner;

public class FileReadingNumbers {
	
    public static void main(String[] args) throws IOException {
		File myFile = new File("Numbers.txt");
		Scanner inputFile = new Scanner(myFile);

		int count = 0;
		double x, sum=0.0;

		while (inputFile.hasNext()) {
			x = inputFile.nextDouble();
			sum += x;
			count +=1;
		}
		System.out.println(count);
		System.out.println(sum/count);

		inputFile.close();
	}
}