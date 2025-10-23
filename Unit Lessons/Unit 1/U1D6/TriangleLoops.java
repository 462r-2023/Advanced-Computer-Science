public class TriangleLoops {
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String s = "";
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < i + 1; j++) {
                s += letter;
            }
            s += "\n";
        }
        return s;
    }

    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String s = "";
        for (int i = numberOfRows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                s += letter;
            }
            s += "\n";
        }
        return s;
    }

    public static String createNumbersTriangle(int numberOfRows) {
        String s = "";
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < i + 1; j++) {
                s += i + 1 + " ";
            }
            s += "\n";
        }
        return s;
    }

    public static String createAlphabetTriangle(int numberOfRows) {
        numberOfRows = Math.min(numberOfRows, 26);
        String s = "";
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = i + 1; j < numberOfRows; j++) {
                s += " ";
            }
            for (int j = i * 2; j > -1; j--) {
                s += (char) (65 + i - Math.abs(j - i));
            }
            s += "\n";
        }
        return s;
    }
}
