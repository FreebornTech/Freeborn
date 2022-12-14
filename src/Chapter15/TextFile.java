package Chapter15;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.FormatterClosedException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TextFile {
    public static void main(String[] args) {
        try (Formatter output = new Formatter("clients.txt")) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ",
                    "Enter account number, first name, last name and balance. ",
                    "Enter end-of-file indicator to end input. ");
            while (input.hasNext()) {
                try {
                    output.format("%d %s %s %.2f%n", input.nextInt(),
                    input.nextInt(),
                    input.nextInt(),
                    input.nextDouble());
                } catch (NoSuchElementException elementException) {
                    System.err.println("Invalid input. Please try again. ");
                    input.nextLine();

                }
                System.out.println("? ");

            }
        }
        catch (SecurityException | FileNotFoundException |
                 FormatterClosedException e) {
                e.printStackTrace();
        }
    }
}