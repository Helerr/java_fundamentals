package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class DrivingException extends Exception {
    @Override
    public String toString() {
        return "Not allowed to drive";
    }
}

class CanDrive {
    public static void canDrive(int age) throws DrivingException{
        if (age > 18){
            throw new DrivingException();
        } else {
            System.out.println("Can Drive");
        }
    }

    public static void main(String[] args) {
        try {
            canDrive(10);
        } catch (DrivingException exc){
            System.out.println(exc.toString());
        }
    }
}
