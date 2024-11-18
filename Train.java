import java.util.ArrayList;
public class Train {
    private Engine engine;
    private ArrayList<Car> trainCars;
//Creates a new instance of a train
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        Engine engine = new Engine(fuelType, fuelCapacity);
        this.engine = engine;
        this.trainCars = new ArrayList<>(nCars);
        ArrayList<String> emptyCar = new ArrayList<>();
        for (int i = 0; i < nCars; i++) {
            trainCars.add(new Car(passengerCapacity,emptyCar));
        }
    }
//Returns the engine fuel type
    public Engine getEngine() {
        return this.engine;
    }
//Returns the max capacity of the entire car
    public int getMaxCapacity() {
        int max = 0;
        for (Car car: this.trainCars) {
            max += car.getCapacity();
        }
        return max;
    }
//Returns the ith car
    public Car getCar(int i){
       return this.trainCars.get(i);
    }
//Returns the amount of avaliable seats on the entire train
    public int seatsRemaining() {
        int remaining = 0;
        for (Car car: this.trainCars) {
            remaining += car.seatsRemaining();
        }
        return remaining;
    }
//Prints the passengers on every car on the train
    public void printManifest() {
        for (Car car: trainCars) {
            car.printManifest();
        }
    }
    public static void main(String[] args) {
        Train sample = new Train(FuelType.ELECTRIC, 100, 4, 8);
        Passenger p1 = new Passenger("p1");
        p1.boardCar(sample.getCar(2));
        System.out.println(sample.getEngine());
        System.out.println(sample.getMaxCapacity());
        System.out.println(sample.seatsRemaining());
        System.out.println(sample.getCar(2));
        sample.printManifest();
    }
}
