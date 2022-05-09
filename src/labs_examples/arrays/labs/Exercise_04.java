package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] ints = new int[][]{{1,2,3},{2,3,4,5},{5,4,3,2,1},{1,2}};

        for (int[] intArray: ints ) {
            for (int number: intArray) {
                System.out.print(number + " ");
            }
            System.out.println();
        }


    }


}
