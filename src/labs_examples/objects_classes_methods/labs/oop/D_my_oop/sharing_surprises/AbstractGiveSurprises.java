package labs_examples.objects_classes_methods.labs.oop.D_my_oop.sharing_surprises;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.containers.IBag;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.factory.BagFactory;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise.ISurprise;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
    private static final BagFactory bagFactory = new BagFactory();
    private IBag surpriseContainer;
    private int waitTime;

    public AbstractGiveSurprises(String containerType, int waitTimeBetweenSurprises) {
        this.surpriseContainer = bagFactory.makeBag(containerType);
        this.waitTime = waitTimeBetweenSurprises;
    }

    public void put(ISurprise newSurprise){
        this.surpriseContainer.put(newSurprise);
    }

    public void put(IBag surprises){
        this.surpriseContainer.put(surprises);
    }

    public IBag getSurpriseContainer() {
        return surpriseContainer;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void give(){
        this.surpriseContainer.takeOut().enjoy();
        giveWithPassion();
    }

    public void giveAll(){
        int amountOfSurprises = this.surpriseContainer.size();
        for (int i = 0; i < amountOfSurprises; i++) {
            give();
            // Sleep for X seconds - code snippet
            try {
                TimeUnit.SECONDS.sleep(10); // number of seconds to sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isEmpty(){
        return this.surpriseContainer.isEmpty();
    }

    protected abstract void giveWithPassion();
}
