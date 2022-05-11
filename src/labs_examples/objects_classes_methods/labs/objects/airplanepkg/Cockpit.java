package labs_examples.objects_classes_methods.labs.objects.airplanepkg;

public class Cockpit {
    private int seats;
    private boolean autoPilotFunction;

    public Cockpit(int seats, boolean autoPilotFunction) {
        this.seats = seats;
        this.autoPilotFunction = autoPilotFunction;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isAutoPilotFunction() {
        return autoPilotFunction;
    }

    public void setAutoPilotFunction(boolean autoPilotFunction) {
        this.autoPilotFunction = autoPilotFunction;
    }

    @Override
    public String toString() {
        return "Cockpit{" +
                "seats=" + seats +
                ", autoPilotFunction=" + autoPilotFunction +
                '}';
    }
}
