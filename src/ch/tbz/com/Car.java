package ch.tbz.com;

public class Car extends Vehicle {

    private int doors;
    private boolean hasHinge;

    /**
     * Extends the abstract class Vehicle and inherits the fields name and isAvailable
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
     * @return
     */
    public boolean hasHinge() {
        return hasHinge;
    }

    @Override
    public void printResult() {
        System.out.println("Doors:\t\t\t" + getDoors());
        System.out.println("Hinge:\t\t\t" + hasHinge());
    }
}
