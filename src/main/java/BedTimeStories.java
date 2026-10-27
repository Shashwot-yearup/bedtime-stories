import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class BedTimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The name of story: "); //asks the question for the
        String fileName = scanner.nextLine();


        //try catch to see if the story is in the file or not
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/" + fileName))){ //reads the files. // *("src/main/resources/")* if we put the .txt file in the resources folder.

            String line; //counter for lines
            int lineNumber = 1; // counter for numbers of lines.

            while ((line = reader.readLine()) != null){ // while loop to go threw each line and print them out.
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }
        } catch (Exception e) {
            System.out.println("Error reading file:" + e.getMessage()); //sout a error message if the stories in not in the file.
        }

        scanner.close();
    }
}
