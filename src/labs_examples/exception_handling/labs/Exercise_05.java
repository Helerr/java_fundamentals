package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        try {
            driveCar("test");
        } catch (NumberFormatException e){
            System.out.println("Invalid input");
        }

    }

    public static void driveCar(String age) throws NumberFormatException{
        int n;

        try {
            n = Integer.parseInt(age);
        } catch (NumberFormatException e){
            throw new NumberFormatException();
        }
        if (n > 18){
            System.out.println("Driving");
        } else {
            System.out.println("You're not allowed");
        }


    }

}