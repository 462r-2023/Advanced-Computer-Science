public class CarTester {
    public static void main(String[] args) {
        Car car1 = new Car("Prius", "         John      Driver       ", 3);
        System.out.println("Car1 info:\n" + car1);
        Car car2 = new Car();
        System.out.println("Car2 info:\n" + car2);
        System.out.println("Car1 equals car2: " + car1.equals(car2));
        AutoUtils.cleanCar(car1);
        car2.setModel("Prius");
        car1.setUsername(car2.getUsername());
        System.out.println("Car1 info:\n" + car1);
        System.out.println("Car2 info:\n" + car2);
        System.out.println("Car1 equals car2: " + car1.equals(car2));
        car1.setCleanlinessLevel(-100);
        System.out.println("Car1 cleanliness: " + car1.getCleanlinessLevel());
    }
}
