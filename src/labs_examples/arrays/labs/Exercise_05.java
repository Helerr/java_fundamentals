package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {


    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
        };

        for (int i = ints.length - 1; i >= 0; i--) {
            for (int j = ints.length - 1; j >= 0; j--) {
                if (j % 2 != 0){
                    System.out.print(ints[i][j] + " ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
