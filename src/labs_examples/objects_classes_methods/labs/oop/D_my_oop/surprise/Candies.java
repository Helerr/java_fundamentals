package labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise{
    private final static Random random = new Random();
    private static final ArrayList<String> candyTypesList = new ArrayList<>(Arrays.asList("chocolate","jelly","fruits","vanilla"));
    private String candyType;
    private int candyAmount;

    public Candies(String candyType, int candyAmount) {
        this.candyType = candyType;
        this.candyAmount = candyAmount;
    }

    public String getCandyType() {
        return candyType;
    }

    public int getCandyAmount() {
        return candyAmount;
    }

    @Override
    public String toString() {
        return "Candies{" +
                "candyType='" + candyType + '\'' +
                ", candyAmount=" + candyAmount +
                '}';
    }

    @Override
    public void enjoy() {
        System.out.println("\t***Here's your delicious present! Enjoy!***");
        System.out.println("---- You got " + this.candyAmount + " of " + this.candyType + " candy.----");
    }

    public static ISurprise generate(){
        int candyTypePicker = random.nextInt(4);
        int candyAmount = random.nextInt(101);
        String candyType = candyTypesList.get(candyTypePicker);
        return new Candies(candyType,candyAmount);
    }

}
