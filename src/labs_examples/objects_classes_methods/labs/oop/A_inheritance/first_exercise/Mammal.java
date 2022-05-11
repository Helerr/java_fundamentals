package labs_examples.objects_classes_methods.labs.oop.A_inheritance.first_exercise;

public class Mammal extends Terestrial{
    private boolean hasWings;
    private String dietType;

    public Mammal(boolean canBreath, int legs, int eyes, boolean hasWings, String dietType) {
        super(canBreath, legs, eyes);
        this.hasWings = hasWings;
        this.dietType = dietType;
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "hasWings=" + hasWings +
                ", dietType='" + dietType + '\'' +
                '}';
    }

    @Override
    public void walking() {
        System.out.println("It definitely has some legs...");
    }
}
