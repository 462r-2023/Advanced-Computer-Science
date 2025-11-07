public class ArrayDemo {

    public static String[] AddToArray(String[] arr, String n) {
        String[] newArray = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = n;
        return newArray;
    }

    public static void main(String[] args) {

        // Pokemon
        // you can have a team of 6, index is max of 5

        // Pokemon[] team = new Pokemon[6];
        // {0, 1, 2, 3, 4, 5} ordered list

        // team[3] = new Pokemon("Charizard");
        // {0, 1, 2, "Charizard", 4, 5}

        // this code created a list of size 6, so the max index is 5

        // Pokemon[] box = new Pokemon[30];

        // Pokemon[] box = new Pokemon[1000];

        int[] myFavoriteNumbers = new int[4];
        // my favorite numbers sub 0
        myFavoriteNumbers[0] = 70;
        myFavoriteNumbers[1] = 71;
        myFavoriteNumbers[2] = 72;
        myFavoriteNumbers[3] = 73;

        System.out.println(myFavoriteNumbers[0]);

        // print out the entire list using a for loop

        for (int i = 0; i < myFavoriteNumbers.length; i++) {
            System.out.println(myFavoriteNumbers[i]);
        }

        for (int i : myFavoriteNumbers) {
            System.out.println(i);
        }

        // what if I actually have 5 favorite numbers?

        // list sizes are immutable <- can't change it without creating a new object
        // Strings are a list (array) of characters! They are also immutable.
        // {'h', 'e', 'l', 'l', 'o'}

        String[] beatles = {"John Lennon", "Paul McCartney", "Ringo Starr", "George Harrison"};

        for (String i : beatles) {
            System.out.println(i);
        }

        beatles = AddToArray(beatles, "Boyan");

        for (String i : beatles) {
            System.out.println(i);
        }
    }
}
