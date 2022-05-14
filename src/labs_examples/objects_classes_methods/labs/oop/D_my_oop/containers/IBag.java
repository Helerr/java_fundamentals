package labs_examples.objects_classes_methods.labs.oop.D_my_oop.containers;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise.ISurprise;

public interface IBag {
    // adds a surprise in the bag
    void put(ISurprise newSurprise);

    // adds all the surprises from another IBag
    //   -> the 'bagOfSurprises' will be empty() afterwards
    void put(IBag bagOfSurprises);

    // removes a surprise from the bag and returns it
    ISurprise takeOut();

    // Checks if the bag is empty or not
    boolean isEmpty();

    // Returns the number of surprises
    int size();

    String getType();
}
