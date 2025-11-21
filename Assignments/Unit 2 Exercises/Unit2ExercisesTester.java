public class Unit2ExercisesTester {
    public static void main(String[] args) {
        System.out.println("alarmClock(1, false): " + Unit2Exercises.alarmClock(1, false));
        System.out.println("alarmClock(5, false): " + Unit2Exercises.alarmClock(1, false));
        System.out.println("alarmClock(10, false): " + Unit2Exercises.alarmClock(1, false));

        System.out.println("love6(6, 4): " + Unit2Exercises.love6(6, 4));
        System.out.println("love6(4, 5): " + Unit2Exercises.love6(4, 5));
        System.out.println("love6(5, 1): " + Unit2Exercises.love6(5, 1));

        System.out.println("redTicket(2, 2, 2): " + Unit2Exercises.redTicket(2, 2, 2));
        System.out.println("redTicket(2, 2, 1): " + Unit2Exercises.redTicket(2, 2, 1));
        System.out.println("redTicket(0, 0, 0): " + Unit2Exercises.redTicket(0, 0, 0));

        System.out.println("fizzString(\"fig\"): " + Unit2Exercises.fizzString("fig"));
        System.out.println("fizzString(\"dib\"): " + Unit2Exercises.fizzString("dib"));
        System.out.println("fizzString(\"fib\"): " + Unit2Exercises.fizzString("fib"));

        System.out.println("doubleChar(\"The\"): " + Unit2Exercises.doubleChar("The"));
        System.out.println("doubleChar(\"AAbb\"): " + Unit2Exercises.doubleChar("AAbb"));
        System.out.println("doubleChar(\"Hi-There\"): " + Unit2Exercises.doubleChar("Hi-There"));

        System.out.println("countHi(\"abc hi ho\"): " + Unit2Exercises.countHi("abc hi ho"));
        System.out.println("countHi(\"ABChi hi\"): " + Unit2Exercises.countHi("ABChi hi"));
        System.out.println("countHi(\"hihi\"): " + Unit2Exercises.countHi("hihi"));

        System.out.println("catDog(\"catdog\"): " + Unit2Exercises.catDog("catdog"));
        System.out.println("catDog(\"catcat\"): " + Unit2Exercises.catDog("catcat"));
        System.out.println("catDog(\"1cat1cadodog\"): " + Unit2Exercises.catDog("1cat1cadodog"));

        System.out
                .println("mixString(\"abc\", \"xyz\"): " + Unit2Exercises.mixString("abc", "xyz"));
        System.out.println(
                "mixString(\"Hi\", \"There\"): " + Unit2Exercises.mixString("Hi", "There"));
        System.out.println(
                "mixString(\"xxxx\", \"There\"): " + Unit2Exercises.mixString("xxxx", "There"));

        System.out.println("repeatEnd(\"Hello\", 3): " + Unit2Exercises.repeatEnd("Hello", 3));
        System.out.println("repeatEnd(\"Hello\", 2): " + Unit2Exercises.repeatEnd("Hello", 2));
        System.out.println("repeatEnd(\"Hello\", 1): " + Unit2Exercises.repeatEnd("Hello", 1));

        System.out.println(
                "endOther(\"Hiabc\", \"abc\"): " + Unit2Exercises.endOther("Hiabc", "abc"));
        System.out.println(
                "endOther(\"AbC\", \"HiaBc\"): " + Unit2Exercises.endOther("AbC", "HiaBc"));
        System.out.println(
                "endOther(\"abc\", \"abXabc\"): " + Unit2Exercises.endOther("abc", "abXabc"));

        System.out.println("countCode(\"aaacodebbb\"): " + Unit2Exercises.countCode("aaacodebbb"));
        System.out.println("countCode(\"codexxcode\"): " + Unit2Exercises.countCode("codexxcode"));
        System.out.println("countCode(\"cozexxcope\"): " + Unit2Exercises.countCode("cozexxcope"));

        System.out.println("countEvens([2, 1, 2, 3, 4]): "
                + Unit2Exercises.countEvens(new int[] {2, 1, 2, 3, 4}));
        System.out.println(
                "countEvens([2, 2, 0]): " + Unit2Exercises.countEvens(new int[] {2, 2, 0}));
        System.out.println(
                "countEvens([1, 3, 5]): " + Unit2Exercises.countEvens(new int[] {1, 3, 5}));

        System.out.println(
                "bigDiff([10, 3, 5, 6]): " + Unit2Exercises.bigDiff(new int[] {10, 3, 5, 6}));
        System.out.println(
                "bigDiff([7, 2, 10, 9]): " + Unit2Exercises.bigDiff(new int[] {7, 2, 10, 9}));
        System.out.println(
                "bigDiff([2, 10, 7, 2]): " + Unit2Exercises.bigDiff(new int[] {2, 10, 7, 2}));

        System.out.println("sum13([1, 2, 2, 1]): " + Unit2Exercises.sum13(new int[] {1, 2, 2, 1}));
        System.out.println("sum13([1, 1]): " + Unit2Exercises.sum13(new int[] {1, 1}));
        System.out.println(
                "sum13([1, 2, 2, 1, 13]): " + Unit2Exercises.sum13(new int[] {1, 2, 2, 1, 13}));

        System.out.println("fizzArray(4): " + Unit2Exercises.fizzArray(4));
        System.out.println("fizzArray(1): " + Unit2Exercises.fizzArray(1));
        System.out.println("fizzArray(10): " + Unit2Exercises.fizzArray(10));

        System.out.println("haveThree([3, 1, 3, 1, 3]): "
                + Unit2Exercises.haveThree(new int[] {3, 1, 3, 1, 3}));
        System.out.println(
                "haveThree([3, 1, 3, 3]): " + Unit2Exercises.haveThree(new int[] {3, 1, 3, 3}));
        System.out.println("haveThree([3, 4, 3, 3, 4]): "
                + Unit2Exercises.haveThree(new int[] {3, 4, 3, 3, 4}));

        System.out.println("fizzArray2(4): " + Unit2Exercises.fizzArray2(4));
        System.out.println("fizzArray2(10): " + Unit2Exercises.fizzArray2(10));
        System.out.println("fizzArray2(2): " + Unit2Exercises.fizzArray2(2));

        System.out.println(
                "zeroFront([1, 0, 0, 1]): " + Unit2Exercises.zeroFront(new int[] {1, 0, 0, 1}));
        System.out.println("zeroFront([0, 1, 1, 0, 1]): "
                + Unit2Exercises.zeroFront(new int[] {0, 1, 1, 0, 1}));
        System.out.println("zeroFront([1, 0]): " + Unit2Exercises.zeroFront(new int[] {1, 0}));

        System.out.println("wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"a\"): "
                + Unit2Exercises.wordsWithout(new String[] {"a", "b", "c", "a"}, "a"));
        System.out.println("wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"b\"): "
                + Unit2Exercises.wordsWithout(new String[] {"a", "b", "c", "a"}, "b"));
        System.out.println("wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"c\"): "
                + Unit2Exercises.wordsWithout(new String[] {"a", "b", "c", "a"}, "c"));

        System.out.println("scoresAverage([2, 2, 4, 4]): "
                + Unit2Exercises.scoresAverage(new int[] {2, 2, 4, 4}));
        System.out.println("scoresAverage([4, 4, 4, 2, 2, 2]): "
                + Unit2Exercises.scoresAverage(new int[] {4, 4, 4, 2, 2, 2}));
        System.out.println("scoresAverage([3, 4, 5, 1, 2, 3]): "
                + Unit2Exercises.scoresAverage(new int[] {3, 4, 5, 1, 2, 3}));

        System.out.println("scoresIncreasing([1, 3, 4]): "
                + Unit2Exercises.scoresIncreasing(new int[] {1, 3, 4}));
        System.out.println("scoresIncreasing([1, 3, 2]): "
                + Unit2Exercises.scoresIncreasing(new int[] {1, 3, 2}));
        System.out.println("scoresIncreasing([1, 1, 4]): "
                + Unit2Exercises.scoresIncreasing(new int[] {1, 1, 4}));

        System.out.println("scoresSpecial([12, 10, 4], [2, 20, 30]): "
                + Unit2Exercises.scoresSpecial(new int[] {12, 10, 4}, new int[] {2, 20, 30}));
        System.out.println("scoresSpecial([20, 10, 4], [2, 20, 10]): "
                + Unit2Exercises.scoresSpecial(new int[] {20, 10, 4}, new int[] {2, 20, 10}));
        System.out.println("scoresSpecial([12, 11, 4], [2, 20, 31]): "
                + Unit2Exercises.scoresSpecial(new int[] {12, 11, 4}, new int[] {2, 20, 31}));

        System.out.println("firstTwo(\"hello\"): " + Unit2Exercises.firstTwo("hello"));
        System.out.println("firstTwo(\"hi\"): " + Unit2Exercises.firstTwo("hi"));
        System.out.println("firstTwo(\"h\"): " + Unit2Exercises.firstTwo("h"));
        System.out.println("firstTwo(\"\"): " + Unit2Exercises.firstTwo(""));

        System.out.println("divide(5, 2): " + Unit2Exercises.divide(5, 2));
        System.out.println("divide(2, 5): " + Unit2Exercises.divide(2, 5));
        System.out.println("divide(4, 2): " + Unit2Exercises.divide(4, 2));
        System.out.println("divide(10, 55): " + Unit2Exercises.divide(10, 55));
    }
}
