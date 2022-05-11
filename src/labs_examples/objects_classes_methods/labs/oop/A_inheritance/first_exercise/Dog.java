package labs_examples.objects_classes_methods.labs.oop.A_inheritance.first_exercise;

public class Dog extends Mammal{
    private String name;
    private String color;

    public Dog(boolean canBreath, int legs, int eyes, boolean hasWings, String dietType, String name, String color) {
        super(canBreath, legs, eyes, hasWings, dietType);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void walking() {
        System.out.println("Ok...4 legs for sure. There's no other way...");
    }
}
