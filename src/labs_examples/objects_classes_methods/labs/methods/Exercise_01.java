package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int prod = multiply(10,5);
        int div = divide(20, 10);
        printJoke();
        int yearsToS = yearsToSeconds(10);
        int length = argsLength("alex", "carl", "mike", "joe", "Pneumonoultramicroscopicsilicovolcanoconiosis");

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int multiply(int a, int b){
        return a*b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static int divide(int a, int b){
        return a/b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    static void printJoke(){
        System.out.println("Knock knock!\n" +
                "Who's there?\n" +
                "The pizza delivery");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static int yearsToSeconds(int years){
        return years*86400*365;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    static int argsLength(String... args){
        int count = 0;
        for (String word : args ) {
            count += word.length();
        }
        return count;
    }





}
