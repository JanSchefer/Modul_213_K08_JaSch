package ch.tbz.com;

public class Bike extends Vehicle {

    int seats;
    boolean hasHelmet;

    public Bike(String name, Boolean isAvailable, int seats, boolean hasHelmet) {
        super(name, isAvailable);
        this.seats = seats;
        this.hasHelmet = hasHelmet;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void printResult() {
        System.out.println("Seats:\t\t\t" + getSeats());
        System.out.println("Helmet:\t\t\t" + hasHelmet);
    }

}
