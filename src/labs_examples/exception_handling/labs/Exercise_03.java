package labs_examples.exception_handling.labs;

import java.text.ParseException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class Read{
    static Scanner scanner = new Scanner(System.in);

    public static void readInput(){
        System.out.println("Please enter the input: ");
        try {
            int number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Not a number.");
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        Read.readInput();
    }

}
