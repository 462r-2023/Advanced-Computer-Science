public class Unit1ExercisesTester {
    public static void main(String[] args) {
        System.out.println("helloName(\"Bob\"): " + Unit1Exercises.helloName("Bob"));
        System.out.println("helloName(\"Alice\"): " + Unit1Exercises.helloName("Alice"));
        System.out.println("helloName(\"X\"): " + Unit1Exercises.helloName("X"));

        System.out.println(
                "makeOutWord(\"<<>>\", \"Yay\"): " + Unit1Exercises.makeOutWord("<<>>", "Yay"));
        System.out.println("makeOutWord(\"<<>>\", \"WooHoo\"): "
                + Unit1Exercises.makeOutWord("<<>>", "WooHoo"));
        System.out.println(
                "makeOutWord(\"[[]]\", \"word\"): " + Unit1Exercises.makeOutWord("[[]]", "word"));

        System.out.println("withoutEnd(\"Hello\"): " + Unit1Exercises.withoutEnd("Hello"));
        System.out.println("withoutEnd(\"java\"): " + Unit1Exercises.withoutEnd("java"));
        System.out.println("withoutEnd(\"coding\"): " + Unit1Exercises.withoutEnd("coding"));

        System.out.println(
                "comboString(\"Hello\", \"hi\"): " + Unit1Exercises.comboString("Hello", "hi"));
        System.out.println(
                "comboString(\"hi\", \"Hello\"): " + Unit1Exercises.comboString("hi", "Hello"));
        System.out
                .println("comboString(\"aaa\", \"b\"): " + Unit1Exercises.comboString("aaa", "b"));

        System.out.println("left2(\"Hello\"): " + Unit1Exercises.left2("Hello"));
        System.out.println("left2(\"java\"): " + Unit1Exercises.left2("java"));
        System.out.println("left2(\"hi\"): " + Unit1Exercises.left2("hi"));

        System.out.println("middleThree(\"Candy\"): " + Unit1Exercises.middleThree("Candy"));
        System.out.println("middleThree(\"and\"): " + Unit1Exercises.middleThree("and"));
        System.out.println("middleThree(\"solving\"): " + Unit1Exercises.middleThree("solving"));

        System.out.println("withoutEnd2(\"Hello\"): " + Unit1Exercises.withoutEnd2("Hello"));
        System.out.println("withoutEnd2(\"abc\"): " + Unit1Exercises.withoutEnd2("abc"));
        System.out.println("withoutEnd2(\"ab\"): " + Unit1Exercises.withoutEnd2("ab"));

        System.out.println("stringEnds(\"Hello\", 2): " + Unit1Exercises.stringEnds("Hello", 2));
        System.out.println(
                "stringEnds(\"Chocolate\", 3): " + Unit1Exercises.stringEnds("Chocolate", 3));
        System.out.println(
                "stringEnds(\"Chocolate\", 1): " + Unit1Exercises.stringEnds("Chocolate", 1));

        System.out.println("hasBad(\"badxx\"): " + Unit1Exercises.hasBad("badxx"));
        System.out.println("hasBad(\"xbadxx\"): " + Unit1Exercises.hasBad("xbadxx"));
        System.out.println("hasBad(\"xxbadxx\"): " + Unit1Exercises.hasBad("xxbadxx"));

        System.out.println("countVowels(\"Hello\"): " + Unit1Exercises.countVowels("Hello"));
        System.out.println("countVowels(\"abc\"): " + Unit1Exercises.countVowels("abc"));
        System.out.println("countVowels(\"\"): " + Unit1Exercises.countVowels(""));

        System.out.println("countCode(\"aaacodebbb\"): " + Unit1Exercises.countCode("aaacodebbb"));
        System.out.println("countCode(\"codexxcode\"): " + Unit1Exercises.countCode("codexxcode"));
        System.out.println("countCode(\"cozexxcope\"): " + Unit1Exercises.countCode("cozexxcope"));
    }
}
