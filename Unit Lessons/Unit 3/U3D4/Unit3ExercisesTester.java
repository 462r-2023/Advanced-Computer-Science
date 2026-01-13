public class Unit3ExercisesTester {

    public static void main(String[] args) {
        testCalculateStringLengthAverage();
        testReverseString();
        testFindMaxValue();
        testIsPalindrome();
        testSumEvenNumbers();
        testSumOfSquares();
        testGetNthFibonacci();
        testSortArrayDescending();
        testFindLongestWord();
        testCalculateInterest();
        testParsePositiveInteger();
        testGetArrayElement();
        testCalculateSquareRoot();
        testSumArrayElements();
        testCalculatePower();
    }

    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = {"abc", "cde", "efg", "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null element in array
        letters = new String[] {"abc", "cde", "efg", null, "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null array
        try {
            letters = null;
            System.out.println(
                    "Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testReverseString() {
        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testFindMaxValue() {
        // Test Case - Main Case
        int[] testArray = {1, 3, 4, 2};
        System.out.println("Expected 4: " + Unit3Exercises.findMaxValue(testArray));

        // Test Case - Edge Case: An array containing both negative integers and zero
        testArray = new int[] {-1, 5, 0, -10};
        System.out.println("Expected 5: " + Unit3Exercises.findMaxValue(testArray));

        // Test Case - Edge Case: An array containing only negative integers
        testArray = new int[] {-1, -3, -4, -2};
        System.out.println("Expected -1: " + Unit3Exercises.findMaxValue(testArray));

        // Test Case - Edge Case: A null array
        try {
            testArray = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(testArray));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testIsPalindrome() {
        // Test Case - Main Case
        String testString = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(testString));

        // Test Case - Main Case
        testString = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(testString));

        // Test Case - Edge Case: Test with a null string.
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }

        // Test Case - Edge Case: Test with an empty string ("")
        testString = "";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(testString));
    }

    public static void testSumEvenNumbers() {
        // Test Case - Main Case
        int[] testArray = {1, 3, 4, 2};
        System.out.println("Expected 6: " + Unit3Exercises.sumEvenNumbers(testArray));

        // Test Case - Main Case
        testArray = new int[] {-1, -5, -4, -10};
        System.out.println("Expected -14: " + Unit3Exercises.sumEvenNumbers(testArray));

        // Test Case - Edge Case: Test with an array containing both positive and negative even and
        // odd integers
        testArray = new int[] {-1, 3, 4, -2};
        System.out.println("Expected 2: " + Unit3Exercises.sumEvenNumbers(testArray));

        // Test Case - Edge Case: Test with a null array
        try {
            testArray = null;
            System.out.println("Expected exception: " + Unit3Exercises.sumEvenNumbers(testArray));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testSumOfSquares() {
        // Test Case - Main Case
        int[] testArray = {1, 3, 4, 2};
        System.out.println("Expected 30: " + Unit3Exercises.calculateSumOfSquares(testArray));

        // Test Case - Edge Case: Null array
        try {
            testArray = null;
            System.out.println(
                    "Expected exception: " + Unit3Exercises.calculateSumOfSquares(testArray));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testGetNthFibonacci() {
        // Test Case - Main Case
        System.out.println("Expected 13: " + Unit3Exercises.getNthFibonacci(7));

        // Test Case - Edge Case: Negative number
        try {
            System.out.println("Expected exception: " + Unit3Exercises.getNthFibonacci(-1));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the number was negative, as intended");
        }
    }

    private static String printArray(int[] array) {
        String s = "[";
        for (int i : array) {
            s += i + ", ";
        }
        return s.substring(0, s.length() - 2) + "]";
    }

    public static void testSortArrayDescending() {
        // Test Case - Main Case
        int[] testArray = {1, 3, 4, 2};
        Unit3Exercises.sortArrayDescending(testArray);
        System.out.println("Expected [4, 3, 2, 1]: " + printArray(testArray));

        // Test Case - Main Case
        testArray = new int[] {1, -3, 4, -2};
        Unit3Exercises.sortArrayDescending(testArray);
        System.out.println("Expected [4, 1, -2, -3]: " + printArray(testArray));

        // Test Case - Edge Case: Null array
        try {
            testArray = null;
            Unit3Exercises.sortArrayDescending(testArray);
            System.out.println("Expected exception: " + testArray);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testFindLongestWord() {
        // Test Case - Main Case
        String testString = "among us";
        System.out.println("Expected among: " + Unit3Exercises.findLongestWord(testString));

        // Test Case - Main Case
        testString = "the brown fox jumps over the lazy dog";
        System.out.println("Expected brown: " + Unit3Exercises.findLongestWord(testString));

        // Test Case - Edge Case: Test with a null string.
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testCalculateInterest() {
        // Test Case - Main Case
        System.out.println("Expected 121.0: " + Unit3Exercises.calculateInterest(100, 10, 2));

        // Test Case - Edge Case: Test with a negative principal amount.
        try {
            System.out
                    .println("Expected exception: " + Unit3Exercises.calculateInterest(-2, 10, 1));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the principal amount was negative, as intended");
        }

        // Test Case - Edge Case: Test with a negative interest rate.
        try {
            System.out.println(
                    "Expected exception: " + Unit3Exercises.calculateInterest(100, -10, 1));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the interest rate was negative, as intended");
        }

        // Test Case - Edge Case: Test with zero years.
        try {
            System.out
                    .println("Expected exception: " + Unit3Exercises.calculateInterest(100, 10, 0));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the number of years was not positive, as intended");
        }
    }

    public static void testParsePositiveInteger() {
        // Test Case - Main Case
        System.out.println("Expected 100: " + Unit3Exercises.parsePositiveInteger("100"));

        // Test Case - Main Case
        System.out.println("Expected 5: " + Unit3Exercises.parsePositiveInteger("5"));

        // Test Case - Edge Case: Test with "-5".
        try {
            System.out.println("Expected exception: " + Unit3Exercises.parsePositiveInteger("-5"));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the number was not positive, as intended");
        }
    }

    public static void testGetArrayElement() {
        String[] testArray = {"1", "3", "4", "2"};

        // Test Case - Main Case
        System.out.println("Expected \"3\": " + Unit3Exercises.getArrayElement(testArray, 1));

        // Test Case - Main Case
        System.out.println("Expected \"2\": " + Unit3Exercises.getArrayElement(testArray, 3));

        // Test Case - Edge Case: Test with out of range index.
        try {
            System.out
                    .println("Expected exception: " + Unit3Exercises.getArrayElement(testArray, 5));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the index was out of range, as intended");
        }
    }

    public static void testCalculateSquareRoot() {
        // Test Case - Main Case
        System.out.println("Expected 10.0: " + Unit3Exercises.calculateSquareRoot(100));

        // Test Case - Main Case
        System.out.println("Expected root 5: " + Unit3Exercises.calculateSquareRoot(5));

        // Test Case - Edge Case: Test with a negative number.
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateSquareRoot(-1));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the number was negative, as intended\nPossible value to return: "
                            + Double.NaN);
        }
    }

    public static void testSumArrayElements() {
        // Test Case - Main Case
        int[] testArray = {1, 3, 4, 2};
        System.out.println("Expected 10: " + Unit3Exercises.sumArrayElements(testArray));

        // Test Case - Main Case
        testArray = new int[] {5, 1, 3, 4, 2};
        System.out.println("Expected 15: " + Unit3Exercises.sumArrayElements(testArray));

        // Test Case - Edge Case: Test with null array.
        testArray = null;
        try {
            System.out.println("Expected exception: " + Unit3Exercises.sumArrayElements(testArray));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testCalculatePower() {
        // Test Case - Main Case
        System.out.println("Expected 25.0: " + Unit3Exercises.calculatePower(5.0, 2));

        // Test Case - Main Case
        System.out.println("Expected 32.0: " + Unit3Exercises.calculatePower(2.0, 5));

        // Test Case - Edge Case: Test with a negative exponent.
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculatePower(5.0, -1));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the exponent was negative, as intended");
        }
    }
}
