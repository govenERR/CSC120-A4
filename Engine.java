// Stores and regulates information about engine pulling cars
public class Engine {
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    //constructs new object
    public Engine(FuelType f, double maxFuelLevel) {
        this.f = f;
        this.currentFuelLevel = maxFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }
    //returns amount of fuel left in tank
    public double getFuel() {
        return this.currentFuelLevel;
    }
    //returns max amount of fuel possible to have
    public double getMaxFuel() {
        return this.maxFuelLevel;
    }
    //updates the current fuel
    public void setFuel(double newFuel) {
        this.currentFuelLevel = newFuel;
    }
   //returns type of fuel
    public FuelType getFuelType() {
        return this.f;
    }
    // updates the current fuel so that it is 100% full
    public void refuel() {
        double x = getMaxFuel();
        setFuel(x);
    }
    //empties the tank until there is 0 fuel left. 
    public boolean go() {
        double current = getFuel();
        while (current > 0) {
            System.out.println("TRUE");
            setFuel(current - 1);
            System.out.println("There is " + getFuel() + " fuel remaining");
        }
            System.out.println("FALSE");
            return false;
    }
}
public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    while (myEngine.go()) {
        System.out.println("Choo choo!");
    }
    System.out.println("Out of fuel.");
}
