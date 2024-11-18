import java.util.ArrayList;

public class Passenger {
    
    private String name;
//Creates a new passenger 
    public Passenger(String name) {
        this.name = name;
    }
//Puts the passenger on a train car if there is room
    public void boardCar(Car c) {
        if (c.addPassenger(name) == true) {
            System.out.println(name + " has successfully boarded.");
        }
        else { 
            System.out.println("Unable to board, car full.");
        }
    }
//Removes the passenger from the car if they are currently on it
    public void getOffCar(Car c) {
        if (c.removePassenger(name) == true) {
            System.out.println(name + " has left car");
        }
        else {
            System.out.println(name + " is not in the car");
        }
    }
    public static void main(String[] args) {
        Passenger lily = new Passenger("Lily");
        ArrayList<String> c1p = new ArrayList<String>();
        c1p.add("Karen");
        c1p.add("Mike");
        Car e1 = new Car(10,c1p);
        lily.getOffCar(e1);
    }
}
