public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); // 15. added the "new" keyword
        Cat otherCat = new Cat("Tiger Beast", "Tabby"); // 16. added the "new" keyword
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); // 17. added System.out.println()

        System.out.println("Are the cats equal? " + myCat.equals(otherCat)); // 18. changed
                                                                             // "return"
                                                                             // to
                                                                             // System.out.println()
                                                                             // // 19.
                                                                             // changed
                                                                             // "cat's"
                                                                             // to "cats"

        System.out.println("Is my cat hungry? " + myCat.getIsHungry());// 20. changed print() to
                                                                       // System.out.println()

        String firstName = "Tiger";
        String lastName = "Beast"; // 21. replaced == with =
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name to " + name); // 22. added the cat's name
        myCat.setName(name);
        System.out.println("The two cats are the same now: " + myCat.equals(otherCat)); // 23.
                                                                                        // changed
                                                                                        // "cat's"
                                                                                        // to "cats"

    }

}
