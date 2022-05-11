package labs_examples.objects_classes_methods.labs.objects.ObjectAssosiacion;

import java.util.ArrayList;

public class State {
    private String stateName;
    private ArrayList<City> cities;

    public State(String stateName) {
        this.stateName = stateName;
        this.cities = new ArrayList<>();
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "State{" +
                "\nstateName='" + stateName + '\'' +
                ", \ncities=" + cities.toString() +
                "\n}";
    }
}
