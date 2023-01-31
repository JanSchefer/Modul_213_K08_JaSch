package ch.tbz.com;

public class Starter {
    /**
     * Starts the Programm (representative for main)
     * @param args
     * @throws ValidInputException
     */
    public static void main(String[] args) throws ValidInputException {
        Garage garage = new Garage();
        garage.fillGarage();
        garage.printGarage();

    }
}
