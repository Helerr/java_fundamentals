package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import labs_examples.objects_classes_methods.labs.objects.constructoroverload.Car;

public class Main {
    public static void main(String[] args) {
        Dog labrador = new Dog("Labrador","thin",true);
        Cat egyptian = new Cat("bald", "Egyptian");
        Bug spider = new Bug(false,8,"other bugs",true,false);

        ActionsDependency creature = new ActionsDependency(labrador);
        creature.walking("hooman");
        creature.communicate("hooman");
        creature.interact("bowl of food");

        creature.setTerrestrial(egyptian);
        creature.walking("hairy ball");
        creature.communicate("annoying human");
        creature.interact("Friskies");

        creature.setTerrestrial(spider);
        creature.walking("the corner to set up a web");
        creature.communicate("my web");
        creature.interact("human leg");

    }
}
