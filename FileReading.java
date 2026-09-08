
import java.io.*;
import java.util.Scanner;
/*
 * This program demonstrates how to read numeric data from a text file.
 * It opens a file named "Data.txt", reads three double values from the file,
 * calculates their sum, and displays the result.
 */

public class FileReading {
	
    public static void main(String[] args) throws IOException {
        
        // Create a File object representing the file to be read
        File myFile = new File("Data.txt");
        
        // Create a Scanner to read data from the file
        Scanner inputFile = new Scanner(myFile);

        // Variables to store the three numbers and their sum
        double x, y, z, sum;

        // Read three double values from the file
        x = inputFile.nextDouble();
        y = inputFile.nextDouble();
        z = inputFile.nextDouble();

        // Calculate the sum of the three values
        sum = x + y + z;

        // Display the sum
        System.out.println(sum);

        // Close the file when finished reading
        inputFile.close();
    }
}