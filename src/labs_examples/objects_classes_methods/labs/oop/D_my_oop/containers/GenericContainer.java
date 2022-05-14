package labs_examples.objects_classes_methods.labs.oop.D_my_oop.containers;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise.ISurprise;

import java.util.ArrayList;
import java.util.Random;

public abstract class GenericContainer implements IBag {
    private ArrayList<ISurprise> surprisesContainer;
    private final static Random random = new Random();

    public GenericContainer() {
        surprisesContainer = new ArrayList<>();
    }

    public ArrayList<ISurprise> getSurprisesContainer() {
        return surprisesContainer;
    }

    @Override
    public void put(ISurprise newSurprise) {
        surprisesContainer.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        GenericContainer tempStorage = (GenericContainer) bagOfSurprises;
        this.surprisesContainer.addAll(tempStorage.getSurprisesContainer());
        tempStorage.getSurprisesContainer().clear();
    }

    @Override
    public boolean isEmpty() {
        return this.surprisesContainer.isEmpty();
    }

    @Override
    public int size() {
        return this.surprisesContainer.size();
    }
}
