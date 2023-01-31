package ch.tbz.com;

public class Bike extends Vehicle {

    private int seats;
    private boolean hasHelmet;

    /**
     * Extends the abstract class Vehicle and inherits the fields name and isAvailable
     * @param name
     * @param isAvailable
     * @param seats
     * @param hasHelmet
     */
    public Bike(String name, Boolean isAvailable, int seats, boolean hasHelmet) {
        super(name, isAvailable);
        this.seats = seats;
        this.hasHelmet = hasHelmet;
    }

    /**
     *
     * @return
     */
    public int getSeats() {
        return seats;
    }

    /**
     *
     * @return
     */
    public boolean hasHelmet() {
        return hasHelmet;
    }
    @Override
    public void printResult() {
        System.out.println("Seats:\t\t\t" + getSeats());
        System.out.println("Helmet:\t\t\t" + hasHelmet());
    }

}
