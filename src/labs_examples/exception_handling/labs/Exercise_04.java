package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class ReadIn{
    static Scanner scanner = new Scanner(System.in);

    public static void readInput(){
        System.out.println("Please enter the input: ");
        try {
            int number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Not a number.");
            try {
                int number = 10;
                int secondNumber = 0;
                System.out.println(number/secondNumber);
            } catch (ArithmeticException exc){
                System.out.println("Illegal division");
            }
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        Read.readInput();
    }

}
