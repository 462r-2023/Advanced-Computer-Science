public class SpaceshipTester {

    public static void main(String[] args) {
        // 1. instantiate a spaceship object
        Spaceship ship = new Spaceship("A spaceship", 30, 90.0, true);
        // the new keyword creates a new instance of the class (aka an object)

        // 2. invoke a method
        String shipDescription = ship.getDescription();

        int shipPassengerCount = ship.getPassengerCount();

        System.out.println(shipDescription);
        System.out.println(shipPassengerCount);
        System.out.println(ship.getShieldsActive());
        System.out.println(ship.getFuelLevel());

        ship.setDescription("Not a spaceship");
        ship.setPassengerCount(0);
        ship.setShieldsActive(false);
        ship.setFuelLevel(0.0);

        System.out.println(ship.getDescription());
        System.out.println(ship.getPassengerCount());
        System.out.println(ship.getShieldsActive());
        System.out.println(ship.getFuelLevel());
    }
}
