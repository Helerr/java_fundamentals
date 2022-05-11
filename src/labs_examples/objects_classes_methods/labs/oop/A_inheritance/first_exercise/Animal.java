package labs_examples.objects_classes_methods.labs.oop.A_inheritance.first_exercise;

public class Animal {
    private boolean canBreath;

    public Animal(boolean canBreath) {
        this.canBreath = canBreath;
    }

    public boolean isCanBreath() {
        return canBreath;
    }

    public void setCanBreath(boolean canBreath) {
        this.canBreath = canBreath;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "canBreath=" + canBreath +
                '}';
    }

    public void walking(){
        System.out.println("I don't know how this thing moves...");
    }
}
