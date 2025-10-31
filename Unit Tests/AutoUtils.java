public class AutoUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        return Math.max(Math.min(cleanlinessLevel, 10), 0);
    }

    public static String generateUsername(String name) {
        return "@" + name.substring(0, name.indexOf(" ")).toLowerCase() + "_"
                + name.substring(name.indexOf(" ") + 1).toLowerCase() + "_"
                + (int) (Math.random() * 100 + 1950);
    }

    public static void cleanCar(Car car) {
        car.setCleanlinessLevel(car.getCleanlinessLevel() + 2);
    }

    public static String fixName(String name) {
        name = name.trim();
        return name.substring(0, name.indexOf(" ")) + " "
                + name.substring(name.indexOf(" ")).trim();
    }
}
