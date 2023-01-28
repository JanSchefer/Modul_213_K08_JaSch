package ch.tbz.com;

import ch.tbz.com.Garage;

public class main {

    public static void main(String[] args) throws ValidInputException {
        Garage garage = new Garage();
        garage.fillGarage();
        garage.printGarage();

    }
}
