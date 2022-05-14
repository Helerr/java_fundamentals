package labs_examples.objects_classes_methods.labs.oop.D_my_oop.sharing_surprises;

public class GiveSurpriseAndApplause extends GiveSurprises {

    public GiveSurpriseAndApplause(String containerType, int waitTimeBetweenSurprises) {
        super(containerType, waitTimeBetweenSurprises);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("👏👏👏👏👏Applause!Applause!Applause!Applause! 👏👏👏👏👏");
    }
}
