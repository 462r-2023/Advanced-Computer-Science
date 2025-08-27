// A class is a collection of related attributes and behaviors

public class HelloWorld {

    // Main -> an entrypoint for your computer to start running code
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("My name is Boyan");

        System.out.print("My favorite pizza topping is cheese.");
        System.out.print("My favorite drink is water.");

        // 8 primitive data types
        int number = 5; // integer
        char letter = 'a'; // character
        boolean isTrue = true; // true or false
        float decimal = 0.5f; // 32 bit decimal
        double bigdecimal = 0.5; // 64 bit decimal

        // INT ALTERNATIVES (can ignore for this class)
        byte age = 25;
        short population = 3200;
        long bigInteger = 10000;

        String myName = "lopez"; // String is a CLASS not a primitive data type
        // a collection of PRIMITIVE characters to describe text

        // print out the length of the string using the length() method
        System.out.println(myName.length());

        // conditional statements
        // if this happens then that happens
        int value = 5;
        if (value == 5) {
            System.out.println(value);
        }

        boolean isComSciFun = true;

        if (isComSciFun) {
            System.out.println("Comp Sci is fun!");
        } else {
            System.out.println("Comp Sci Sucks");
        }

        if (isComSciFun) {
            System.out.println("Comp Sci is really fun!");
        } else {
            System.out.println("Comp Sci stresses me out.");
        }

        // Challenge: Write a conditional if-else statement where you do something if you ate 5
        // apples vs 10, it should print something if neither condition is true

        int appleCount = 10;

        if (appleCount == 5 || appleCount == 10) {
            System.out.println("You ate " + appleCount + " apples.");
        } else {
            System.out.println("You ate neither 5 nor 10 apples.");
        }

        // == equals
        // > greater than
        // < less than
        // >= greater than or equal to
        // <= less than or equal to
        // != not equal to
    }
}
