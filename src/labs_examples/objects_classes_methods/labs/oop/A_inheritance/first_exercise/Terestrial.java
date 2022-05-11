package labs_examples.objects_classes_methods.labs.oop.A_inheritance.first_exercise;

public class Terestrial extends Animal{
    private int legs;
    private int eyes;

    public Terestrial(boolean canBreath, int legs, int eyes) {
        super(canBreath);
        this.legs = legs;
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    @Override
    public String toString() {
        return "Terestrial{" +
                "legs=" + legs +
                ", eyes=" + eyes +
                '}';
    }

    @Override
    public void walking() {
        System.out.println("Maybe it has legs...");
    }
}
