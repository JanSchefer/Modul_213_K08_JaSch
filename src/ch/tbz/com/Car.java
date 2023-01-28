package ch.tbz.com;


public class Car extends Vehicle {

    private int doors;
    private boolean hasHinge;

    /**
     *
     * @param name
     * @param isAvailable
     * @param doors
     * @param hasHinge
     */
    public Car(String name, boolean isAvailable, int doors, boolean hasHinge) {
        super(name, isAvailable);
        this.doors = doors;
        this.hasHinge = hasHinge;
    }

    /**
     *
     * @return
     */
    public int getDoors() {
        return doors;
    }

    /**
     *
     * @param doors
     */
    public void setDoors(int doors) {
        this.doors = doors;
    }

    /**
     *
     * @return
     */
    public boolean hasHinge() {
        return hasHinge;
    }

    /**
     *
     * @param hasHinge
     */
    public void setHasHinge(boolean hasHinge) {
        this.hasHinge = hasHinge;
    }

    @Override
    public void printResult() {
        System.out.println("Doors:\t\t\t" + getDoors());
        System.out.println("Hinge:\t\t\t" + hasHinge());
    }
}
