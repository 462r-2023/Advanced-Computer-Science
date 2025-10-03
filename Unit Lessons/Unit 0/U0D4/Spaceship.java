public class Spaceship {
    // camelCase -> a way to write variable names, and it's a standard

    // instance variables
    private String description;
    private int passengerCount;
    private double fuelLevel;
    private boolean shieldsActive;

    // constructors

    public Spaceship(String description, int passengerCount, double fuelLevel,
            boolean shieldsActive) {
        this.description = description;
        this.passengerCount = passengerCount;
        this.fuelLevel = fuelLevel;
        this.shieldsActive = shieldsActive;
    }

    // methods
    // getters (aka accessors)

    public String getDescription() {
        return description;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean getShieldsActive() {
        return shieldsActive;
    }

    // setters (these methods are void)
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setShieldsActive(boolean shieldsActive) {
        this.shieldsActive = shieldsActive;
    }

    // challenge: use 3 setters to update the values of 3 different instance variables, make sure to print before and after the update.
}
