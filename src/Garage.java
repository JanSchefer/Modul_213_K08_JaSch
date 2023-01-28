import java.util.ArrayList;

public class Garage {

    ArrayList <Car> cars = new ArrayList<Car>();
    ArrayList <Bike> bikes = new ArrayList<Bike>();


    public void fillGarage() {
        cars.add(new Car("auto1",true,4,true));
        cars.add(new Car("auto2",true,4,true));

        bikes.add(new Bike("bike1",true,2,true));
        bikes.add(new Bike("bike2",true,1,true));
    }
}
