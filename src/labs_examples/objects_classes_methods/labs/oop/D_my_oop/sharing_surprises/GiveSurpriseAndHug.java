package labs_examples.objects_classes_methods.labs.oop.D_my_oop.sharing_surprises;

public class GiveSurpriseAndHug extends GiveSurprises {

    public GiveSurpriseAndHug(String containerType, int waitTimeBetweenSurprises) {
        super(containerType, waitTimeBetweenSurprises);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("🤗🤗🤗🤗🤗 Here's a hug, you lucky bastard! 🤗🤗🤗🤗🤗");
    }
}
