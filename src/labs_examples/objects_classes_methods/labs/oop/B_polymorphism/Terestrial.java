package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Terestrial implements TerrestrialActions{
    private boolean canBreath;
    private int amountOfLegs;
    private String dietType;

    public Terestrial(boolean canBreath, int amountOfLegs, String dietType) {
        this.canBreath = canBreath;
        this.amountOfLegs = amountOfLegs;
        this.dietType = dietType;
    }

    public Terestrial(int amountOfLegs, String dietType) {
        this.amountOfLegs = amountOfLegs;
        this.dietType = dietType;
        this.canBreath = true;
    }

    public Terestrial(int amountOfLegs){
        this.amountOfLegs = amountOfLegs;
        this.dietType = "Omnivore";
        this.canBreath = true;
    }

    public Terestrial(String dietType) {
        this.dietType = dietType;
        this.amountOfLegs = 4;
        this.canBreath = true;
    }
    public Terestrial(){
        this.dietType = "IDK, it probably doesn't eat.";
        this.amountOfLegs = 0;
        this.canBreath = false;
    }

    public boolean getCanBreath() {
        return canBreath;
    }

    public void setCanBreath(boolean canBreath) {
        this.canBreath = canBreath;
    }

    public int getAmountOfLegs() {
        return amountOfLegs;
    }

    public void setAmountOfLegs(int amountOfLegs) {
        this.amountOfLegs = amountOfLegs;
    }

    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    @Override
    public String toString() {
        return "Terestrial{" +
                "canBreath=" + canBreath +
                ", amountOfLegs=" + amountOfLegs +
                ", dietType='" + dietType + '\'' +
                '}';
    }

    @Override
    public void walking(String destination){
        System.out.println("Terrestrial abstract movement on land towards : " + destination);
    }

    @Override
    public void communicate(String target){
        System.out.println("Terrestrial abstract communication ability between this creature and " + target);
    }

    @Override
    public void interact(String target){
        System.out.println("Terrestrial abstract ability to interact with : " + target);
    }
}
