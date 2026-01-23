import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        boolean isEven = (nums[0] % 2 == 0);
        int streak = 1;
        for (int i = 1; i < nums.length; i++) {
            if ((nums[0] % 2 == 0) == isEven) {
                streak++;
                if (streak == 3) {
                    return true;
                }
            } else {
                streak = 1;
                isEven = !isEven;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int[] intArray = new int[end - start];
        for (int i = start; i < end; i++) {
            intArray[i - start] = i;
        }
        return intArray;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        String[] strArray = new String[end - start];
        for (int i = start; i < end; i++) {
            strArray[i - start] = "";
            if (i % 3 != 0 && i % 5 != 0) {
                strArray[i - start] += i;
                continue;
            }
            if (i % 3 == 0) {
                strArray[i - start] += "Fizz";
            }
            if (i % 5 == 0) {
                strArray[i - start] += "Buzz";
            }
        }
        return strArray;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int[] newNums = nums.clone();
        int firstEven = 0;
        int lastOdd = newNums.length - 1;
        while (lastOdd > 0 && newNums[lastOdd] % 2 == 0) {
            lastOdd--;
        }
        while (firstEven < lastOdd && newNums[firstEven] % 2 == 1) {
            lastOdd++;
        }
        while (firstEven < lastOdd) {
            int temp = newNums[firstEven];
            newNums[firstEven] = newNums[lastOdd];
            newNums[lastOdd] = temp;
            while (lastOdd > 0 && newNums[lastOdd] % 2 == 0) {
                lastOdd--;
            }
            while (firstEven < lastOdd && newNums[firstEven] % 2 == 1) {
                lastOdd++;
            }
        }
        return newNums;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}
