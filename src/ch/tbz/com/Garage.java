package ch.tbz.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Garage implements Renting{
    Scanner sc = new Scanner(System.in);
    ArrayList<Car> cars = new ArrayList<>();
    ArrayList<Bike> bikes = new ArrayList<>();
    Boolean isRunning = true;

    // To fill the Array's, so that something can be printed
    public void fillGarage() {
        cars.add(new Car("auto4", true, 4, true));
        cars.add(new Car("auto2", false, 2, false));
        cars.add(new Car("auto1", true, 1, true));
        cars.add(new Car("auto3", false, 5, true));

        bikes.add(new Bike("bike3", true, 2, true));
        bikes.add(new Bike("bike2", false, 1, true));
        bikes.add(new Bike("bike4", true, 1, false));
        bikes.add(new Bike("bike1", true, 1, false));
    }

    public void printGarage() {

        do {
            System.out.println("""
                            Choose a Option:
                            1\tCars
                            2\tBikes
                            3\tRent
                            0\tQuit
                            """
            );
            try {
                handleInput(sc.nextInt());
            } catch (ValidInputException e){
                System.out.println(e.getMessage());
            } catch (InputMismatchException e){
                System.out.println("please enter a valid number (0,1,2 or 3)");
                sc.nextLine();
            }
        } while (isRunning);
    }

    /**
     * The Input gets validated via the Switch and leads to the proper actions
     * @param input
     * @throws ValidInputException
     */
    public void handleInput(int input) throws ValidInputException {
        switch (input) {
            //Quit
            case 0 -> {
                System.out.println("Bye");
                isRunning = false;
            }
            //Cars
            case 1 -> {
                isRunning = true;
                printResult(cars);
            }
            //Bikes
            case 2 -> {
                isRunning = true;
                printResult(bikes);
            }
            //Rent
            case 3 -> {
                getRentableVehicles();
                isRunning = true;
            }
            default -> throw new ValidInputException("please enter a valid number (0,1,2 or 3)");
        }
    }

    /**
     *
     * @param list
     * @param <T> is used, so we can send bike or car as attribute. It extends Vehicle to assure we get just car or bike.
     */
    public <T extends Vehicle> void printResult(List<T> list) {
        try {
            Collections.sort(list);
        }catch (NullPointerException e) {
            System.out.println("The list is empty");
        }
        for (Vehicle vehicle : list) {
            System.out.println("Name:\t\t\t" + vehicle.getName());
            System.out.println("Is Available:\t" + vehicle.getAvailable());
            vehicle.printResult();
            System.out.println("--------------------------------");
        }
    }

    @Override
    public void getRentableVehicles() {
        System.out.println("\nCars");
        checkIfRentable( cars);
        System.out.println("\nBikes");
        checkIfRentable( bikes);
    }

    /**
     *
     * @param vehicles
     * @param <T>
     */
    private <T extends Vehicle> void checkIfRentable( ArrayList<T> vehicles) {
        for(Vehicle singleVehicle : vehicles){
            if(singleVehicle.getAvailable()){
                System.out.println(singleVehicle.getName() + " is available");
            }
        }
    }
}
