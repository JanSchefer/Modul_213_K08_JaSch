public class Car extends Vehicle{

    int doors;
    boolean hasHinge;

    public Car(String name, boolean isAvailable,int doors, boolean hasHinge) {
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

    public boolean isHasHinge() {
        return hasHinge;
    }

    public void setHasHinge(boolean hasHinge) {
        this.hasHinge = hasHinge;
    }
}
