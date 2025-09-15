public class CastingDemo {
    public static void main(String[] args) {

        // Implicit Casting

        int smallNumber = 100;
        long bigNumber = smallNumber; // int to long
        float decimal = bigNumber; // long to float
        float bigDecimal = decimal; // float to double

        // Explicit Casting
        // Manually converting to a data type that may incur data loss

        double pi = 3.14159;
        int engineerPi = (int) pi;
        System.out.println(engineerPi); // truncation - you lost all decimals
        pi = engineerPi;
        System.err.println(pi);

        long population = 3000000000L;
        int limitedPopulation = (int) population;
        System.out.println("population: " + limitedPopulation);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
