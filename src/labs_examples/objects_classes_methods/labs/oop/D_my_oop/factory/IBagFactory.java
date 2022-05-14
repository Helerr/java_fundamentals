package labs_examples.objects_classes_methods.labs.oop.D_my_oop.factory;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.containers.IBag;

public interface IBagFactory {
    // Create a new container, according to the specified type
    IBag makeBag(String type);
}
