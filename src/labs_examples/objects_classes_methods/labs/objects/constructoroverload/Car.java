package labs_examples.objects_classes_methods.labs.objects.constructoroverload;

public class Car {
    private int wheels;
    private int doors;
    private String color;
    private String model;
    private String engineFuel;
    private boolean autoGearbox;

    public Car(int wheels, int doors, String color, String model, String engineFuel, boolean autoGearbox) {
        this.wheels = wheels;
        this.doors = doors;
        this.color = color;
        this.model = model;
        this.engineFuel = engineFuel;
        this.autoGearbox = autoGearbox;
    }
    public Car(String color, String model, String engineFuel, boolean autoGearbox){
        this.wheels = 4;
        this.doors = 4;
        this.color = color;
        this.model = model;
        this.engineFuel = engineFuel;
        this.autoGearbox = autoGearbox;
    }
    public Car(String model, String engineFuel, boolean autoGearbox){
        this.wheels = 4;
        this.doors = 4;
        this.color = "StandardBlack";
        this.model = model;
        this.engineFuel = engineFuel;
        this.autoGearbox = autoGearbox;
    }

}
