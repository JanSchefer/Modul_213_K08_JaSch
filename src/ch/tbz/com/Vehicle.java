package ch.tbz.com;


public abstract class Vehicle implements Sorting {

    private String name;
    private Boolean isAvailable;

    /**
     *
     * @param name
     * @param isAvailable
     */
    protected Vehicle(String name, Boolean isAvailable) {
        this.name = name;
        this.isAvailable = isAvailable;
    }
    public abstract void printResult();

    /**
     *
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
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public Boolean getAvailable() {
        return isAvailable;
    }

    /**
     *
     * @param available
     */
    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

}
