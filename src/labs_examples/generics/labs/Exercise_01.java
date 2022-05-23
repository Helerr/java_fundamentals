package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

public class Exercise_01 <T extends Number & Comparable<T>, U extends Number & Comparable<U>>{
    T t;
    U u;

    public Exercise_01(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    @Override
    public String toString() {
        return "Exercise_01{" +
                "t=" + t +
                ", u=" + u +
                '}';
    }

    public double sum(){
        return this.t.doubleValue() + this.u.doubleValue();
    }
    public double produce(){
        return this.t.doubleValue() + this.u.doubleValue();
    }

    public static void main(String[] args) {
        Exercise_01<Integer,Integer> ints = new Exercise_01<>(10,20);
        System.out.println(ints.sum());
        System.out.println(ints.produce());
        Exercise_01<Double, Double> doubles = new Exercise_01<>(10.23, 30.432);
        System.out.println(doubles.sum());
        System.out.println(doubles.produce());

    }

}