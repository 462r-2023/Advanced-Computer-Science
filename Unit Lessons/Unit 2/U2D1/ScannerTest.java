import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your full government name?");

        String governmentName = keyboard.nextLine();

        System.out.println("Hello, " + governmentName + ". Nice to meet you!");

        System.out.println("What is your current age?");

        int age = keyboard.nextInt();

        if (age >= 18) {
            System.out.println("Congratulations, you can vote!");
        } else {
            System.out.println("Come back again soon!");
        }

        System.out.println(
                "(true/false) Will you vote to make mangos mandatory for breakfast every day?");
        boolean lovesMangos = keyboard.nextBoolean();

        while (!lovesMangos) {
            System.out
                    .println("Again... You VOTE to make mangos mandatory every day. (true/false)");
            lovesMangos = keyboard.nextBoolean();
        }

        System.out.println("Great! Thank you for supporting big mango!");

        keyboard.close();
    }
}
