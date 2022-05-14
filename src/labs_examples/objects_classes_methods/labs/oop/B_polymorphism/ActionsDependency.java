package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class ActionsDependency implements TerrestrialActions {
    TerrestrialActions terrestrial;

    public ActionsDependency(TerrestrialActions terrestrial) {
        this.terrestrial = terrestrial;
    }

    public void setTerrestrial(TerrestrialActions terrestrial) {
        this.terrestrial = terrestrial;
    }

    @Override
    public void walking(String destination) {
        this.terrestrial.walking(destination);
    }

    @Override
    public void communicate(String otherCreature) {
        this.terrestrial.communicate(otherCreature);
    }

    @Override
    public void interact(String target) {
        this.terrestrial.interact(target);
    }
}
