package ch.tbz.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Garage implements Renting{
    Scanner sc = new Scanner(System.in);
    ArrayList<Car> cars = new ArrayList<Car>();
    ArrayList<Bike> bikes = new ArrayList<Bike>();
    Boolean isRunning = true;


    public void fillGarage() {
        cars.add(new Car("auto8", true, 4, true));
        cars.add(new Car("auto2", false, 4, true));

        bikes.add(new Bike("bike6", true, 2, true));
        bikes.add(new Bike("bike2", false, 1, true));
    }

    public void printGarage() throws ValidInputException {

        do {
            System.out.println(
                            "\nChoose a Option:\n" +
                            "1\tCars\n" +
                            "2\tBikes\n" +
                            "3\tRent\n" +
                            "0\tQuit"
            );
            try {
                validateResult(sc.nextInt());
            } catch (ValidInputException e){
                System.out.println(e.getMessage());
            } catch (InputMismatchException e){
                System.out.println("please enter a valid number (0,1,2 or 3)");
                sc.nextLine();
            }
        } while (isRunning);
    }

    public void validateResult(int input) throws ValidInputException {
        switch (input) {
            case 0:
                System.out.println("Bye");
                isRunning = false;
                break;
            case 1: //Cars
                isRunning = true;
                printResult(cars);
                break;
            case 2: //Bikes
                isRunning = true;
                printResult(bikes);
                break;
            case 3: //Rent
                getRentableVehicles();
                isRunning = true;
                break;
            default:
                throw new ValidInputException("please enter a valid number (0,1,2 or 3)");


        }
    }


    public <T extends Vehicle> void printResult(ArrayList<T> list) {
        Collections.sort(list);
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

    private <T extends Vehicle> void checkIfRentable( ArrayList<T> vehicles) {
        for(Vehicle singleVehicle : vehicles){
            if(singleVehicle.getAvailable()){
                System.out.println(singleVehicle.getName() + " is available");
            }
        }
    }
}
