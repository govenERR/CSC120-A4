import java.util.*;
public class Car {
    private int maxPassengers;
    private ArrayList<String> CarPassengers;
//Creates a new car object
    public Car(int maxPassengers, ArrayList<String> passengers) {
        this.maxPassengers = maxPassengers;
        this.CarPassengers = new ArrayList<String>(this.maxPassengers);
        passengers.forEach(passenger -> this.CarPassengers.add(passenger));
    }
//Returns the maximum capacity of the train car
    public int getCapacity() {
        return this.maxPassengers;
    }
//Returns the amount of seats left in the car
    public int seatsRemaining() {
        int maxPassengers = this.maxPassengers;
        return (maxPassengers - this.CarPassengers.size());
    }
//Adds a new passenger to the car, if there is space
    public boolean addPassenger(String name) {
        if (seatsRemaining() != 0) {
            this.CarPassengers.add(name);
            return true;
        }
        else {
            return false;
        }
    }
//Removes a passenger from the car, if they are in it
    public boolean removePassenger(String name) {
        if (this.CarPassengers.contains(name) == true) {
            this.CarPassengers.remove(name);
            return true;
        }
        else {
            return false;
        }
    }
//Prints all the members of the car, or "This car is empty" if no one is on board
    public void printManifest() {
        if (this.CarPassengers.size() != 0) {
            this.CarPassengers.forEach(passenger -> System.out.println(passenger));
        }
        else {
            System.out.println("This car is empty.");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> c1p = new ArrayList<String>();
        c1p.add("Karen");
        c1p.add("Mike");
        Car e1 = new Car(10,c1p);
        System.out.println(e1.CarPassengers);
        System.out.println(e1.getCapacity());
        System.out.println(e1.seatsRemaining());
        e1.removePassenger("Mike");
        System.out.println(e1.CarPassengers);
    }
}
