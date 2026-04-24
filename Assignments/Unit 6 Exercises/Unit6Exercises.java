public class Unit6Exercises {

    /**
     * Problem 1 - Factorial: Write a recursive and non-recursive method that returns the factorial
     * of a given number n.
     */
    public static int factorial(int n) {
        int product = 1;
        for (int i = n; i > 0; i--) {
            product *= i;
        }
        return product;
    }

    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    /**
     * Problem 2 - Fibonacci Sequence: Write a recursive and non-recursive method that returns the
     * nth number in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        int[] calculated = new int[n + 1];
        calculated[0] = 0;
        calculated[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            calculated[i] = calculated[i - 1] + calculated[i - 2];
        }
        return calculated[n];
    }

    public static int fibonacciRecursive(int n) {
        int[] calculated = new int[n + 1];
        calculated[0] = 0;
        calculated[1] = 1;
        return fibonacciRecursive(calculated, n);
    }

    private static int fibonacciRecursive(int[] calculated, int n) {
        if (n > 0 && calculated[n] == 0) {
            calculated[n] =
                    fibonacciRecursive(calculated, n - 2) + fibonacciRecursive(calculated, n - 1);
        }
        return calculated[n];
    }

    /**
     * Problem 3 - Sum of Digits: Write a recursive and non-recursive method that returns the sum of
     * the digits of a given integer.
     */
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int sumDigitsRecursive(int n) {
        if (n == 0) {
            return n;
        }
        return n % 10 + sumDigitsRecursive(n / 10);
    }

    /**
     * Problem 4 - Count X: Write a recursive and non-recursive method that returns the count of
     * occurrences of 'x' in a given string.
     */
    public static int countX(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (c == 'x' || c == 'X') {
                sum++;
            }
        }
        return sum;
    }

    public static int countXRecursive(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return (str.charAt(0) == 'x' || str.charAt(0) == 'X' ? 1 : 0)
                + countXRecursive(str.substring(1));
    }

    /**
     * Problem 5 - Reverse String: Write a recursive and non-recursive method that returns the
     * reverse of a given string.
     */
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String reverseStringRecursive(String str) {
        if (str.length() == 1) {
            return str;
        }
        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }

    /**
     * Problem 6 - Power of a Number: Write a recursive and non-recursive method that calculates and
     * returns the value of base raised to the power of exponent.
     */
    public static int power(int base, int exponent) {
        int product = 1;
        for (int i = 0; i < exponent; i++) {
            product *= base;
        }
        return product;
    }

    public static int powerRecursive(int base, int exponent) {
        if (base == 0) {
            return 1;
        }
        return base * powerRecursive(base, exponent - 1);
    }

    /**
     * Problem 7 - Palindrome Checker: Write a recursive and non-recursive method that checks
     * whether a given string is a palindrome.
     */
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        return str.equals(reverseString(str));
    }

    public static boolean isPalindromeRecursive(String str) {
        str = str.toLowerCase();
        return str.equals(reverseStringRecursive(str));
    }

    /**
     * Problem 8 - Greatest Common Divisor (GCD): Write a recursive and non-recursive method that
     * finds and returns the greatest common divisor of two numbers.
     */
    public static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a < b) {
                b %= a;
            } else {
                a %= b;
            }
        }
        return Math.max(a, b);
    }

    public static int gcdRecursive(int a, int b) {
        if (a == b) {
            return a;
        }
        return gcdRecursive(Math.min(a, b), Math.max(a, b) % Math.min(a, b));
    }

    /**
     * Problem 9 - Bunny Ears 2: We have bunnies standing in a line, numbered 1, 2, ... The odd
     * bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears,
     * because they each have a raised foot. Recursively return the number of "ears" in the bunny
     * line 1, 2, ... n (without loops or multiplication).
     */

    public static int bunnyEars(int bunnies) {
        return (3 * bunnies + 1) / 2;

    }

    public static int bunnyEarsRecursive(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnies % 2 + bunnyEarsRecursive(bunnies - 1);
    }

    /**
     * Problem 10 - Binary Search: Write a recursive and non-recursive method that implements the
     * binary search algorithm to find and return the index of a given element in a sorted array.
     */
    public static int binarySearch(int[] arr, int key) {
        int i = -1;
        for (int k = arr.length; k > 0; k /= 2) {
            while (i + k < arr.length && arr[i + k] <= key) {
                i += k;
            }
        }
        return (i > -1 && arr[i] == key ? i : -1); // Element not found
    }

    public static int binarySearchRecursiveHelper(int[] arr, int key, int low, int high) {
        if (low < high) {
            if (key == arr[(low + high) / 2]) {
                return key;
            }
            if (key < arr[(low + high) / 2]) {
                return binarySearchRecursiveHelper(arr, key, low, (low + high) / 2 - 1);
            }
            return binarySearchRecursiveHelper(arr, key, (low + high) / 2 + 1, high);
        }
        if (arr[low] == key) {
            return low;
        }
        return -1;
    }

    // DO NOT EDIT! Work on the helper version above this method. This method is to be used for
    // testing purposes only.
    public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursiveHelper(arr, key, 0, arr.length - 1); // Element not found
    }


}
