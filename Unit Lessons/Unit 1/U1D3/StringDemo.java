public class StringDemo {

    // in the AP, only use these methods from this class

    public static void main(String[] args) {
        // Strings are objects
        String fullName = "Juan Lopez";
        String fullName2 = "Juan Lopez";

        System.out.println(fullName == fullName2);
        fullName2 = "Juan Antonio Lopez";
        String fullName3 = new String("Juan Lopez");

        // fullName3 += ":)";

        // STRINGS ARE IMMUTABLE (they can't change)
        // Any change immediately creates a new string object

        // Dog dog1 = new Dog();
        // Dog dog1 = new Dog();

        System.out.println(fullName == fullName3); // false
        System.out.println(fullName.equals(fullName3)); // true

        // methods
        // charAt() -> returns the char value at the index
        // "Juan Lopez"
        System.out.println(fullName.charAt(3));

        // indexOf() -> returns the index of a char value
        // "Juan Lopez"
        System.out.println(fullName.indexOf('n'));

        // "Juan Antonio Lopez"
        System.out.println(fullName2.indexOf('n'));



        // substring() -> returns a piece of a string given a starting and ending index

        // "Juan Antonio Lopez"
        int firstSpace = fullName2.indexOf(" "); // finds the index of the first space

        String middleLastName = fullName2.substring(firstSpace); // create a substring starting at
                                                                 // the first space to the end
        // " Antonio Lopez"
        System.out.println(middleLastName.indexOf('n')); // find index of n (return 2)

        // "Antonio"
        String middleName = fullName2.substring(5, 13); // substring(inclusive, exclusive)
        // substring(inclusive, exclusive)

        System.out.println(middleName.indexOf("z")); // -1, this is useful

        // compareTo() -> returns a number depending on the order
        String string1 = "abc";
        String string2 = "abcde";

        System.out.println(string1.compareTo(string2));
        // returns negative if string1 is "before" string2
        // returns positive if string1 is "after"
        // returns 0 if strings are equal

    }
}
