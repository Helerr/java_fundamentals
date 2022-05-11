package labs_examples.objects_classes_methods.labs.oop.A_inheritance.first_exercise;

public class Labrador extends Dog{
    private String name;
    private boolean likesHumans;

    public Labrador(boolean canBreath, int legs, int eyes, boolean hasWings, String dietType, String name, String color, String name1, boolean likesHumans) {
        super(canBreath, legs, eyes, hasWings, dietType, name, color);
        this.name = name1;
        this.likesHumans = likesHumans;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public boolean isLikesHumans() {
        return likesHumans;
    }

    public void setLikesHumans(boolean likesHumans) {
        this.likesHumans = likesHumans;
    }

    @Override
    public String toString() {
        return "Labrador{" +
                "name='" + name + '\'' +
                ", likesHumans=" + likesHumans +
                '}';
    }

    @Override
    public void walking() {
        System.out.println("Derp...sometimes I like to walk on 2 legs...I'm weird like that...love you hooman");
    }
}
