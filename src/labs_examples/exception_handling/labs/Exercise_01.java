package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */
class Divide{
    public int divide(int a, int b){
        try {
            return a/b;
        } catch (ArithmeticException exc){
            System.out.println(exc.toString());
        }
        return -1;
    }
}

