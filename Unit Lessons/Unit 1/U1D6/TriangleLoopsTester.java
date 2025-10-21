public class TriangleLoopsTester {
    public static void main(String[] args) {
        System.out.println("Letter triangle up of size 3 with letter A:");
        String output = TriangleLoops.createLetterTriangleUp(3, 'A');
        System.out.println(output);
        System.out.println("Letter triangle up of size 5 with letter B:");
        String output2 = TriangleLoops.createLetterTriangleUp(5, 'B');
        System.out.println(output2);

        System.out.println("Letter triangle down of size 3 with letter A:");
        System.out.println(TriangleLoops.createLetterTriangleDown(3, 'A'));
        System.out.println("Letter triangle down of size 5 with letter B:");
        System.out.println(TriangleLoops.createLetterTriangleDown(5, 'B'));

        System.out.println("Number triangle of size 4:");
        System.out.println(TriangleLoops.createNumbersTriangle(4));
        System.out.println("Number triangle of size 25:");
        System.out.println(TriangleLoops.createNumbersTriangle(25));

        System.out.println("Alphabet triangle of size 5:");
        System.out.println(TriangleLoops.createAlphabetTriangle(5));
        System.out.println("Alphabet triangle of size 50:");
        System.out.println(TriangleLoops.createAlphabetTriangle(50));

        System.out.println("Letter triangle up of size -4 with letter B:");
        TriangleLoops.createLetterTriangleUp(-4, 'B');
        System.out.println("Letter triangle down of size -3 with letter A:");
        TriangleLoops.createLetterTriangleDown(-3, 'A');
        System.out.println("Number triangle of size -2:");
        TriangleLoops.createNumbersTriangle(-2);
        System.out.println("Alphabet triangle of size -1:");
        TriangleLoops.createAlphabetTriangle(-1);
    }
}
