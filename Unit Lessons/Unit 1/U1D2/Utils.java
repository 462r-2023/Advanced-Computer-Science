public class Utils {
    public static int generateRandomNumber(int low, int high) {
        return (int) (Math.random() * (high - low) + low);
    }

    public static int generateRandomNumber(int range) {
        return (int) (Math.random() * range);
    }

    public static double generateRandomNumber(double low, double high) {
        return Math.random() * (high - low) + low;
    }

    public static double generateRandomNumber(double range) {
        return Math.random() * range;
    }
}
