package ch.tbz.com;

public class Car extends Vehicle {

    int doors;
    boolean hasHinge;

    public Car(String name, boolean isAvailable, int doors, boolean hasHinge) {
        super(name, isAvailable);
        this.doors = doors;
        this.hasHinge = hasHinge;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean hasHinge() {
        return hasHinge;
    }

    public void setHasHinge(boolean hasHinge) {
        this.hasHinge = hasHinge;
    }

    @Override
    public void printResult() {
        System.out.println("Doors:\t\t\t" + getDoors());
        System.out.println("Hinge:\t\t\t" + hasHinge());
    }
}
