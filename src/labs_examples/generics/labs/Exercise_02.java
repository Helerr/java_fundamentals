package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Demo{
    public static <T extends Number> double sum(ArrayList<T> numbers){
        double sum = 0;
        for (T number: numbers ) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70));

        System.out.println(Demo.sum(numbers));
    }
}