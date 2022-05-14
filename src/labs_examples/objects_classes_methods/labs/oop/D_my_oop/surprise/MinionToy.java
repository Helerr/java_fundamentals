package labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {
    private static final ArrayList<String> minionsList = new ArrayList<>(Arrays.asList("Dave","Carl","Kevin","Stuart","Jerry","Tim"));
    private final String minion;
    private static int currentMinionCounter = 0;
    public MinionToy(String minionName) {
        this.minion = minionName;
    }

    public String getMinion() {
        return minion;
    }

    @Override
    public String toString() {
        return "MinionToy{" +
                "minion='" + minion + '\'' +
                '}';
    }

    public static ISurprise generate(){
        String minionName = minionsList.get(currentMinionCounter);
        currentMinionCounter++;
        if(currentMinionCounter > 5){
            currentMinionCounter = 0;
        }
        return new MinionToy(minionName);
    }

    @Override
    public void enjoy() {
        System.out.println("\t***Here's your favorite yellow plushy! Enjoy!***");
        System.out.println("---- You got " + this.minion + " the minion. This one's a little crazy.----");
    }
}
