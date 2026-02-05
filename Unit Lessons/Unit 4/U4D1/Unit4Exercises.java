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
            if ((nums[i] % 2 == 0) == isEven) {
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
        if (start >= end) {
            return new int[] {};
        }
        int[] intArray = new int[end - start];
        for (int i = start; i < end; i++) {
            intArray[i - start] = i;
        }
        return intArray;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        if (start >= end) {
            return new String[] {};
        }
        String[] strArray = new String[end - start];
        for (int i = start; i < end; i++) {
            strArray[i - start] = "";
            if ((i % 3 != 0) && (i % 5 != 0)) {
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
        int firstOdd = 0;
        int lastEven = newNums.length - 1;
        while (lastEven > 0 && newNums[lastEven] % 2 == 1) {
            lastEven--;
        }
        while (firstOdd < lastEven && newNums[firstOdd] % 2 == 0) {
            firstOdd++;
        }
        while (firstOdd < lastEven) {
            int temp = newNums[firstOdd];
            newNums[firstOdd] = newNums[lastEven];
            newNums[lastEven] = temp;
            while (lastEven > 0 && newNums[lastEven] % 2 == 1) {
                lastEven--;
            }
            while (firstOdd < lastEven && newNums[firstOdd] % 2 == 0) {
                firstOdd++;
            }
        }
        return newNums;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) < 0) {
                nums.remove(i);
            }
        }
        return nums;

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) > 12 && nums.get(i) < 20) {
                nums.remove(i);
            }
        }
        return nums;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        for (int i = strs.size() - 1; i >= 0; i--) {
            if (strs.get(i).length() > 0 && strs.get(i).charAt(strs.get(i).length() - 1) == 'y') {
                strs.remove(i);
            } else {
                strs.set(i, strs.get(i) + "y");
            }
        }
        return strs;
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        for (int i = nums.size() - 1; i >= 0; i--) {
            nums.set(i, nums.get(i) * nums.get(i) + 10);
            if (nums.get(i) % 10 == 5 || nums.get(i) % 10 == 6) {
                nums.remove(i);
            }
        }
        return nums;
    }

}
