package ch.tbz.com;

public class Bike extends Vehicle {

    private int seats;
    private boolean hasHelmet;

    /**
     *
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
     * @param seats
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }

    /**
     *
     * @return
     */
    public boolean hasHelmet() {
        return hasHelmet;
    }

    /**
     *
     * @param hasHelmet
     */
    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void printResult() {
        System.out.println("Seats:\t\t\t" + getSeats());
        System.out.println("Helmet:\t\t\t" + hasHelmet());
    }

}
