public class Bike extends Vehicle{

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
}
