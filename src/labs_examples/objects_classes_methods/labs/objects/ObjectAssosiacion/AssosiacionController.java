package labs_examples.objects_classes_methods.labs.objects.ObjectAssosiacion;

import java.util.ArrayList;

public class AssosiacionController {
    public static void main(String[] args) {
        City losAngeles = new City("Los Angeles");
        City washington = new City("Washington");
        City newYork = new City("New York");

        State alabama = new State("Alabama");

        ArrayList<City> tempList = new ArrayList<>();
        tempList.add(losAngeles);
        tempList.add(washington);
        tempList.add(newYork);

        alabama.setCities(tempList);;
        System.out.println(alabama.toString());
    }
}
