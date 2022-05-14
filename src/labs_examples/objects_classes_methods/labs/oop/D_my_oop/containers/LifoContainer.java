package labs_examples.objects_classes_methods.labs.oop.D_my_oop.containers;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise.ISurprise;

public class LifoContainer extends GenericContainer {
    @Override
    public ISurprise takeOut() {
        int surpriseNumber = super.getSurprisesContainer().size() - 1;
        ISurprise surprise = super.getSurprisesContainer().get(surpriseNumber);
        super.getSurprisesContainer().remove(surprise);
        return surprise;
    }

    @Override
    public String getType() {
        return "LIFO";
    }
}
