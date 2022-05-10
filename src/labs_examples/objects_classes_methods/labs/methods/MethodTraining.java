package labs_examples.objects_classes_methods.labs.methods;


import java.util.ArrayList;

public class MethodTraining {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("n is " + n);
        passByValue(n);
        System.out.println("n is " + n);
        Car ford = new Car("Yellow");
        System.out.println("Car before call : " + ford.getColor());
        passByReference(ford);
        System.out.println("Car after call : " + ford.getColor());
        int consonants = consonantsCount("alex");
        System.out.println("Consonants count is : " + consonants);
        boolean primeNumber = isPrime(15);
        System.out.println("Is it prime? " + primeNumber);
        minAndMax(new int[]{10, 3, 2, 1, 4421,332,313});

        ArrayList<Integer> arr = divisorArray(100, 2, 3);
        System.out.println("arr length is " + arr.size());
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9, 10};
        int[] reversed = reverse(numbers);
        for (int  number: reversed ) {
            System.out.print(number + " ");
        }

    }

    public static int largestNumber(int a, int b) {
        return Math.max(a, b);
    }

    public static int largestNumber(int a, int b, int c) {
        return Math.max(largestNumber(a, b), c);
    }

    public static int largestNumber(int a, int b, int c, int d) {
        return Math.max(largestNumber(a, b, c), d);
    }

    public static void passByValue(int n) {
        n += 10;
        System.out.println("N+=10 is: " + n);
    }

    public static class Car {
        String color;

        public Car(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public static void passByReference(Car car) {
        car.color = "red";
    }

    public static int consonantsCount(String str) {
        int i = 0;
        int count = 0;
        while (i < str.length()) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                count++;
            }
            i++;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void minAndMax(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
    }

//    7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//    In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//    divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//    length of the returned list

    public static ArrayList<Integer> divisorArray (int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= maxNum; i++) {
            if(i % divisor1 == 0 && i % divisor2==0){
                arr.add(i);
            }
        }
        return arr;
    }
    //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    //        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    //        variable is used to temporarily store individual values in the array

    public static int[] reverse(int[] numbers){
        int temp;
        for (int i = 0; i < numbers.length/2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        return numbers;
    }
}
