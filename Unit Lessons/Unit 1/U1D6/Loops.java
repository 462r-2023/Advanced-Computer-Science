public class Loops {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        boolean isRunning = true;
        while (isRunning) {
            count++;
            if (count == 100) {
                isRunning = false;
            }
        }

        // a for-loop is best when you know the exact number of iterations (repetitions)
        // a for-loop is more compact with its syntax

        // a while loop is best when you DON'T know the exact number of repetition
        // a while loop requires the initialization to be outside of the loop, and the
        // iterator to be updated inside the loop

        // loop 4 - dowhile loops
        do {
            System.out.println("do this first");
            System.out.println("then check condition");
        } while (isRunning);

        // loop 5 - dowhile loops
        System.out.println("do this first");
        System.out.println("then check condition");
        while (isRunning) {
            System.out.println("do this first");
            System.out.println("then check condition");
        }

        // loops 6
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println("All work and no play makes jack a dull boy");
                }
            }
        }
        // keep the maximum level of nested loops to 2!

        while (true)
        {
            while (true)
            {
                System.out.println("All work and no play makes jack a dull boy");
            }
        }
    }
}
