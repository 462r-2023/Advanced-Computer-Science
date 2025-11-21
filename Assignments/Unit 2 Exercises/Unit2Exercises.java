public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        if ((day == 0 || day == 6) && vacation) {
            return "off";
        }
        if (day == 0 || day == 6 || vacation) {
            return "10:00";
        }
        return "7:00";
    }

    public static boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || a - b == 6 || b - a == 6;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == b && a == c) {
            if (a == 2) {
                return 10;
            }
            return 5;
        }
        if (a != b && a != c) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        boolean hasFizz = false;
        boolean hasBuzz = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("f")) {
                hasFizz = true;
                break;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("b")) {
                hasBuzz = true;
                break;
            }
        }
        if (hasFizz && hasBuzz) {
            return "FizzBuzz";
        }
        if (hasBuzz) {
            return "Buzz";
        }
        if (hasFizz) {
            return "Fizz";
        }
        return str;
    }

    public static String doubleChar(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return newString;
    }

    public static int countHi(String str) {
        int hiCount = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                hiCount++;
            }
        }
        return hiCount;
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    public static String mixString(String a, String b) {
        String newString = "";
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            newString += a.substring(i, i + 1) + b.substring(i, i + 1);
        }
        for (int i = Math.min(a.length(), b.length()); i < Math.max(a.length(), b.length()); i++) {
            if (i < a.length()) {
                newString += a.substring(i, i + 1);
            } else {
                newString += b.substring(i, i + 1);
            }
        }
        return newString;
    }

    public static String repeatEnd(String str, int n) {
        String newString = "";
        for (int i = 0; i < n; i++) {
            newString += str.substring(str.length() - n);
        }
        return newString;
    }

    public static boolean endOther(String a, String b) {
        return a.substring(a.length() - Math.min(a.length(), b.length())).toLowerCase()
                .equals(b.substring(b.length() - Math.min(a.length(), b.length())).toLowerCase());
    }

    public static int countCode(String str) {
        int codeCount = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 1).equals("c") && str.substring(i + 1, i + 2).equals("o")
                    && str.substring(i + 3, i + 4).equals("e")) {
                codeCount++;
            }
        }
        return codeCount;
    }

    public static int countEvens(int[] nums) {
        int evenCount = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static int bigDiff(int[] nums) {
        int maxInt = Integer.MIN_VALUE;
        int minInt = Integer.MAX_VALUE;
        for (int i : nums) {
            maxInt = Math.max(maxInt, i);
            minInt = Math.min(minInt, i);
        }
        return maxInt - minInt;
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        int prev = 0;
        for (int i : nums) {
            if (i != 13 && prev != 13) {
                sum += i;
            }
            prev = i;
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        int[] numList = new int[n];
        for (int i = 0; i < n; i++) {
            numList[i] = i;
        }
        return numList;
    }

    public static boolean haveThree(int[] nums) {
        int sum = 0;
        int prev = 0;
        for (int i : nums) {
            if (i == 3) {
                if (sum == 3 || prev == 3) {
                    return false;
                }
                sum++;
            }
            prev = i;
        }
        if (sum < 3) {
            return false;
        }
        return true;
    }

    public static String[] fizzArray2(int n) {
        String[] numList = new String[n];
        for (int i = 0; i < n; i++) {
            numList[i] = String.valueOf(i);
        }
        return numList;
    }

    public static int[] zeroFront(int[] nums) {
        int[] numList = new int[nums.length];
        int numPlace = nums.length - 1;
        for (int i = nums.length - 1; i > -1; i--) {
            if (nums[i] != 0) {
                numList[numPlace] = nums[i];
                numPlace--;
            }
        }
        return numList;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int trueCount = 0;
        boolean[] trueFor = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(target) == -1) {
                trueFor[i] = true;
                trueCount++;
            }
        }
        String[] newWords = new String[trueCount];
        int current = 0;
        for (int i = 0; i < words.length; i++) {
            if (trueFor[i]) {
                newWords[current] = words[i];
                current++;
                if (current == trueCount) {
                    break;
                }
            }
        }
        return newWords;
    }

    public static int scoresAverage(int[] scores) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i < scores.length / 2) {
                sum1 += scores[i];
            } else {
                sum2 += scores[i];
            }
        }
        return Math.max(sum1 / (scores.length / 2), sum2 / ((scores.length + 1) / 2));
    }

    public static boolean scoresIncreasing(int[] scores) {
        int prev = 0;
        for (int i : scores) {
            if (i < prev) {
                return false;
            }
            prev = i;
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        return getSpecialScore(a) + getSpecialScore(b);
    }

    public static int getSpecialScore(int[] a) {
        int maxA = 0;
        for (int i : a) {
            if (i % 10 == 0) {
                maxA = Math.max(maxA, i);
            }
        }
        return maxA;
    }

    public static String firstTwo(String str) {
        if (str.length() == 0) {
            return "**";
        }
        if (str.length() == 1) {
            return str + "*";
        }
        return str.substring(0, 2);
    }

    public static double divide(int a, int b) {
        if (a == 0 || b == 0) {
            return 0.0;
        }
        return Math.max(a, b) / (double) Math.min(a, b);
    }
}
