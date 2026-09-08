import java.io.*;

/*
 * This program demonstrates how to write data to a text file.
 * It creates a file named "StudentData.txt", writes information
 * about two students to the file, and then closes the file.
 */

public class FileWriting {

    public static void main(String[] args) throws IOException {

        // Create a PrintWriter object to write data to the file
        PrintWriter outputFile = new PrintWriter("StudentData.txt");

        // Write the student's information
        outputFile.println("Name: Gus, Age: 20, Major: CS");
        outputFile.println("Name: Amanda, Age: 23, Major: Math");

        // Close the file when finished writing
        outputFile.close();
    }
}