package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Bug extends Terestrial{
    private boolean isUgly;
    private boolean shouldDieToday;

    public Bug(boolean canBreath, int amountOfLegs, String dietType, boolean isUgly, boolean shouldDieToday) {
        super(false, 60, "eating at my soul");
        this.isUgly = isUgly;
        this.shouldDieToday = shouldDieToday;
    }

    public boolean isUgly() {
        return isUgly;
    }

    public void setUgly(boolean ugly) {
        isUgly = ugly;
    }

    public boolean isShouldDieToday() {
        return shouldDieToday;
    }

    public void setShouldDieToday(boolean shouldDieToday) {
        this.shouldDieToday = shouldDieToday;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "isUgly=" + isUgly +
                ", shouldDieToday=" + shouldDieToday +
                '}';
    }

    @Override
    public void walking(String destination) {
        System.out.println("Moving my millions of disgusting legs towards " + destination);
    }

    @Override
    public void communicate(String target) {
        System.out.println("Annoyingly buzzing around " + target);
    }

    @Override
    public void interact(String target) {
        System.out.println("Biting into " + target + " in order to disgust and annoy it.");
    }
}
