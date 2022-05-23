package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */
public class Exercise_03 {

    public static <T extends Number> double sum(T number1, T number2){
        return number1.doubleValue() + number2.doubleValue();
    }

    public static <T extends Collection<String>> int palindromAmount(T collection){
        int amount = 0;
        for (String str: collection) {
            int length = str.length();
            String reverse = "";
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + str.charAt(i);
            if (str.equals(reverse))
               amount++;
        }
        return amount;
    }

    public static <T> ArrayList<T> exchange(ArrayList<T> array,T firstElement, T secondElement){
        int firstIndex = array.indexOf(firstElement);
        int secondIndex = array.indexOf(secondElement);

        T temp = array.get(firstIndex);

        array.set(firstIndex,secondElement);
        array.set(secondIndex, temp);

        return array;
    }

    public static <T extends Number & Comparable<T>> T largest(List<T> list, int begin, int end){
        T max = list.get(begin);

        for (int i = begin; i < end; i++) {
            if (max.compareTo(list.get(i)) < 0){
                max = list.get(i);
            }
        }
        return max;
    }
}