package labs_examples.objects_classes_methods.labs.objects.airplanepkg;

public class Engine {
    private int horsePower;
    private String type;

    public Engine(int horsePower, String type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", type='" + type + '\'' +
                '}';
    }
}
