package ch.tbz.com;

import java.util.ArrayList;

public abstract class Vehicle implements Sorting {

    String name;
    Boolean isAvailable;

    public Vehicle(String name, Boolean isAvailable) {
        this.name = name;
        this.isAvailable = isAvailable;
    }
    public abstract void printResult();

    @Override
    public int compareTo(Object o) {
        if (o instanceof Vehicle) {
            Vehicle otherVehicle = (Vehicle) o;
            return getName().compareTo(otherVehicle.getName());
        }
        return 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

}
