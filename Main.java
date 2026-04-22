import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("grades.txt");

        try {
            Scanner input = new Scanner(myFile);

            System.out.println("Student Grades:");

            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
            input.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}