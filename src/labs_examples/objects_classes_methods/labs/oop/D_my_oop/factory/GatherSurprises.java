package labs_examples.objects_classes_methods.labs.oop.D_my_oop.factory;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise.Candies;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise.FortuneCookie;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise.ISurprise;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise.MinionToy;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
    private static final Random random = new Random();

    private GatherSurprises() {
    }

    public static ArrayList<ISurprise> gather(int n) {
        ArrayList<ISurprise> gatheredSurprises = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            gatheredSurprises.add(gather());
        }
        return gatheredSurprises;
    }

    public static ISurprise gather() {
        int surpriseTypePicker = random.nextInt(3);
        switch (surpriseTypePicker) {
            case 0:
                return Candies.generate();
            case 1:
                return FortuneCookie.generate();
            case 2:
                return MinionToy.generate();
            default:
                return null;
        }
    }
}
