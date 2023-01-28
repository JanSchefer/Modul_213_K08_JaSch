package ch.tbz.com;

public class Starter {
    /**
     *
     * @param args
     * @throws ValidInputException
     */
    public static void main(String[] args) throws ValidInputException {
        Garage garage = new Garage();
        garage.fillGarage();
        garage.printGarage();

    }
}
