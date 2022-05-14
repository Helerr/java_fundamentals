package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Dog extends Terestrial {
    private String race;
    private String tail;
    private boolean strongSenseOfSmell;

    public Dog(String race, String tail, boolean strongSenseOfSmell) {
        super(true,4, "carnivore");
        this.race = race;
        this.tail = tail;
        this.strongSenseOfSmell = strongSenseOfSmell;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public boolean isStrongSenseOfSmell() {
        return strongSenseOfSmell;
    }

    public void setStrongSenseOfSmell(boolean strongSenseOfSmell) {
        this.strongSenseOfSmell = strongSenseOfSmell;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "race='" + race + '\'' +
                ", tail='" + tail + '\'' +
                ", strongSenseOfSmell=" + strongSenseOfSmell +
                '}';
    }

    @Override
    public void walking(String destination) {
        System.out.println("Walking on my 4 paws towards " + destination);
    }

    @Override
    public void communicate(String target) {
        System.out.println("Barking at " + target);
    }

    @Override
    public void interact(String target) {
        System.out.println("Biting into and dragging " + target);
    }
}
