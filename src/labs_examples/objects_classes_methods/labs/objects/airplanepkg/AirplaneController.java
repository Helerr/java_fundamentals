package labs_examples.objects_classes_methods.labs.objects.airplanepkg;

public class AirplaneController {
    public static void main(String[] args) {
        Engine engine = new Engine(400, "Diesel");
        Wings wings = new Wings(12000, 4000, false);
        PassengerArea passengerArea = new PassengerArea("childSize", 500);
        Cockpit cockpit = new Cockpit(2, false);
        Airplane airplane = new Airplane(engine,wings,passengerArea,cockpit, 20000, 5000);
        System.out.println(airplane.toString());
    }
}
