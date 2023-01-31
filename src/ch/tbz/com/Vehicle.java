package ch.tbz.com;


public abstract class Vehicle implements Sorting {

    private String name;
    private Boolean isAvailable;

    /**
     *  Parent Class to Car and Bike. Gives the fields name and isAvailable to them
     * @param name
     * @param isAvailable
     */
    protected Vehicle(String name, Boolean isAvailable) {
        this.name = name;
        this.isAvailable = isAvailable;
    }
    public abstract void printResult();

    /**
     * Used to sort the cars and bikes by name
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        if (o instanceof Vehicle otherVehicle) {
            return getName().compareTo(otherVehicle.getName());
        }
        return 0;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public Boolean getAvailable() {
        return isAvailable;
    }

}
