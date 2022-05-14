package labs_examples.objects_classes_methods.labs.oop.D_my_oop.sharing_surprises;

public class GiveSurpriseAndSing extends GiveSurprises {

    public GiveSurpriseAndSing(String containerType, int waitTimeBetweenSurprises) {
        super(containerType, waitTimeBetweenSurprises);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("🎶🎶🎶🎶🎶 Ihaa ihuuu sing the surprise for youuuu 🎶🎶🎶🎶🎶");
    }
}
