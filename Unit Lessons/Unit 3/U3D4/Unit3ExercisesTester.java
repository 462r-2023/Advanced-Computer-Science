public class Unit3ExercisesTester {

    public static void main(String[] args) {
        testCalculateStringLengthAverage();
        testReverseString();
        testFindMaxValue();
        testIsPalindrome();
        testSumEvenNumbers();
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
}
