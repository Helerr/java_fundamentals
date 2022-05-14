package labs_examples.objects_classes_methods.labs.oop.D_my_oop.containers;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise.ISurprise;

import java.util.ArrayList;

public class FifoContainer extends GenericContainer {

    @Override
    public ISurprise takeOut() {
        int surpriseNumber = 0;
        ISurprise surprise = super.getSurprisesContainer().get(surpriseNumber);
        super.getSurprisesContainer().remove(surprise);
        return surprise;
    }

    @Override
    public String getType() {
        return "FIFO";
    }
}
