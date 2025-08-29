public class ConditionalChallenge {
    public static void main(String[] args) {
        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        double temperature = -10;
        System.out.println("Initial temperature: " + temperature);
        boolean isCold = false;
        if (isCold) {
            temperature -= 15;
        } else {
            temperature += 10;
        }
        System.out.println("isCold: " + isCold);
        System.out.println("New temperature: " + temperature);

        // Part 2: Grade Calculator
        System.out.println();
        System.out.println("--- Part 2: Grade Calculator ---");
        System.out.print("Result: ");
        int score = 70;
        if (score >= 70) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // Part 3: Leap Year Checker
        System.out.println();
        System.out.println("--- Part 3: Leap Year Checker ---");
        temperature = 89;
        System.out.println("Temperature: " + 89);
        System.out.print("Season: ");
        if (temperature >= 80) {
            System.out.println("Summer");
        } else if (temperature >= 60) {
            System.out.println("Spring");

        } else if (temperature >= 40) {
            System.out.println("Fall");

        } else {
            System.out.println("Winter");

        }

        // Part 4: Number Classifier
        System.out.println();
        System.out.println("--- Part 4: Number Classifier ---");
        int number = 1000;
        System.out.println("Number: " + number);
        System.out.print("Classification: ");
        if (number > 0) {
            System.out.print("Positive");
        } else if (number < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }

        if (number > 100) {
            System.out.println(", Large");
        } else if (number < -100) {
            System.out.println(", Very Negative");
        }

    }
}
