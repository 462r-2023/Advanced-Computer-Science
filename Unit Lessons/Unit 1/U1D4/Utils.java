public class Utils {

    public static void main(String[] args) {

        // A class that contains a list of characters to form words
        // it gives strings methods that we can use!
        String x = "hello";
        String.valueOf("123");

        int y = 10; // are primitive and DO NOT have any methods

        // Integer Wrapper
        Integer yWrapper = 10; // the value 10 methods now!
        yWrapper.toString();
        Integer.parseInt("123"); // converts strings to integers!

        // Boolean Wrapper
        boolean isFalse = false;
        Boolean isTrue = true;
        isTrue.toString();
        System.out.println(Boolean.parseBoolean("hello"));

        // Double Wrapper
        double decimal = 1.1;
        Double decimalWrapper = 1.1;

        System.out.println(Double.parseDouble("13.76"));
    }
}
