package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
class ArrayDivision{

    public int arrayDivision(int[] nums, int firstIndex, int secondIndex){
        try {
            return nums[firstIndex] / nums [secondIndex];
        } catch (ArithmeticException e){
            System.out.println("Illegal division by 0");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The specified index is out of bounds");
        }
        return -1;
    }
}


