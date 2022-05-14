package labs_examples.objects_classes_methods.labs.oop.D_my_oop.containers;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise.ISurprise;

import java.util.Random;

public class RandomContainer extends GenericContainer {
    private final static Random random = new Random();

    @Override
    public ISurprise takeOut() {
        int surpriseNumber = random.nextInt(super.getSurprisesContainer().size());
        ISurprise surprise = super.getSurprisesContainer().get(surpriseNumber);
        super.getSurprisesContainer().remove(surprise);
        return surprise;
    }

    @Override
    public String getType() {
        return "RANDOM";
    }
}
