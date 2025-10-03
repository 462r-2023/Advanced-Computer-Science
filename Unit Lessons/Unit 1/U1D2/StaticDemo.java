public class StaticDemo {
    public static void main(String[] args) {
        // if you have no constructor, I'll make a default for you and assign all
        // instance variables
        // to their null state
        StaticDemo object = new StaticDemo();

        object.firstIfTest();

        // static methods are sometimes called helper methods
        // classes that hold static methods only are called helper classes
        // you can print on the console without creating a System object
        System.out.println(StaticDemo.secondIfTest());
    }

    // this method belongs to the object of the class
    public void firstIfTest() {
        int x = 4;
        int y = 3;
        int z = 4;

        if (x < y) {
            System.out.println("x is less than y");
        }

        if (x == z) {
            System.out.println("x is less than z");
        }
    }

    // this method belongs to the class, no object required
    public static String secondIfTest() {
        int x = 4;
        int y = 3;
        int z = 4;

        if (x < y) {
            return "x is less than y";
        }

        if (x == z) {
            return "x is less than z";
        }

        return "";
    }
}
