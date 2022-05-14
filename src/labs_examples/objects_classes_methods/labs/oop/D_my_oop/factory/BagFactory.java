package labs_examples.objects_classes_methods.labs.oop.D_my_oop.factory;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.containers.FifoContainer;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.containers.IBag;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.containers.LifoContainer;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.containers.RandomContainer;

public class BagFactory implements IBagFactory {

    public BagFactory() {
    }

    @Override
    public IBag makeBag(String type) {
        String typeToLowerCase = type.toLowerCase();
        switch (typeToLowerCase) {
            case "random":
                return new RandomContainer();
            case "lifo":
                return new LifoContainer();
            case "fifo":
                return new FifoContainer();
            default:
                return null;
        }
    }
}
