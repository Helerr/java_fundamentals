package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Cat extends Terestrial {
    private String furType;
    private String race;

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Cat(String furType, String race) {
        super(true,4,"carnivore");
        this.furType = furType;
        this.race = race;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "furType='" + furType + '\'' +
                ", race='" + race + '\'' +
                '}';
    }

    @Override
    public void walking(String destination) {
        System.out.println("Climbing all the weird places to get to " + destination);
    }

    @Override
    public void communicate(String target) {
        System.out.println("Meowing at " + target);
    }

    @Override
    public void interact(String target) {
        System.out.println("Putting my paw on " + target + " and pushing it off the table.");
    }
}
