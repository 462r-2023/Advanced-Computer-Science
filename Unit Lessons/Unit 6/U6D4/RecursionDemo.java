public class RecursionDemo {
    private int[] calculated;

    public static void main(String[] args) {

    }

    public int factorial(int value) {
        if (value == 0) {
            return 1;
        }
        return value * factorial(value - 1);
    }

    public int fibonacci(int value) {
        calculated = new int[value + 1];
        calculated[0] = 1;
        calculated[1] = 1;
        return fibonacciRecursive(value);
    }

    private int fibonacciRecursive(int value) {
        if (calculated[value] == 0) {
            calculated[value] = fibonacciRecursive(value - 2) + fibonacciRecursive(value - 1);
        }
        return calculated[value];
    }
}
