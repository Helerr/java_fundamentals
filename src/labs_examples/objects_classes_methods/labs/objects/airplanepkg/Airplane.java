package labs_examples.objects_classes_methods.labs.objects.airplanepkg;

public class Airplane {
    private Engine engine;
    private Wings wings;
    private PassengerArea passengerArea;
    private Cockpit cockpit;
    private double fuelCapacity;
    private double currentFuelLevel;

    public Airplane(Engine engine, Wings wings, PassengerArea passengerArea, Cockpit cockpit, double fuelCapacity, double currentFuelLevel) {
        this.engine = engine;
        this.wings = wings;
        this.passengerArea = passengerArea;
        this.cockpit = cockpit;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }

    public PassengerArea getPassengerArea() {
        return passengerArea;
    }

    public void setPassengerArea(PassengerArea passengerArea) {
        this.passengerArea = passengerArea;
    }

    public Cockpit getCockpit() {
        return cockpit;
    }

    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "\nengine=" + engine.toString() +
                ", \nwings=" + wings.toString() +
                ", \npassengerArea=" + passengerArea.toString() +
                ", \ncockpit=" + cockpit.toString() +
                ", \nfuelCapacity=" + fuelCapacity +
                ", \ncurrentFuelLevel=" + currentFuelLevel +
                "\n}";
    }
}
