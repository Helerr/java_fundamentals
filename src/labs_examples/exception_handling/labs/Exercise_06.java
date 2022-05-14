package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Driving{
    public static int numberAtIndex(int[] nums, int index) throws ArrayIndexOutOfBoundsException{
        if(nums.length - 1 > index || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return nums[index];
        }
    }
}