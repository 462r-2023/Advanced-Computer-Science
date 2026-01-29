// array -> objects that represent a list of elements
// the size of an array cannot be changed once initialized (size is immutable)
// if i want to expand the array, i'd have to create an entirely new array and copy the old values

// ArrayList class
// expandable list and has methods!
// must import the class before use

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        // arraylists reserve 10 empty slots in your memory

        names.add("Daniel");
        names.add("Matthew");
        names.add("Morgan");
        names.add("Ava");
        names.add("Crystal");
        names.add("Isabelle");
        names.add("Jason");
        names.add("Ryan");
        names.add("Zayra");
        names.add("Boyan");
        names.add("Henry");

        // reserves 20 slots in memory

        System.out.println(names);
        System.out.println(names.size());

        System.out.println(names.get(4));

        // drawback on arraylists is that we cannot use them with primitive data types!!

        // we can wrap the integer in the Integer wrapper class
        // Integer.parseInt()
        ArrayList<Integer> myFavNumbers = new ArrayList<Integer>();
        myFavNumbers.add(7); // {7}
        myFavNumbers.add(13); // {7, 13}
        myFavNumbers.add(21); // {7, 13, 21}

        myFavNumbers.add(1, 4); // index, value -> {7, 4, 13, 21}

        System.out.println(myFavNumbers.set(2, 3)); // {7, 4, 3, 21}
        // set -> returns the value that was replaced!

        System.out.println(myFavNumbers.remove(1)); // {7, 3, 21}

        System.out.println(myFavNumbers.get(2));


        myFavNumbers.add(myFavNumbers.set(1, 49)); // {7, 49, 21, 3}

    }
}
