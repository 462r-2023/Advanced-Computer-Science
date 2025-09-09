public class SquidTester {
    public static void main(String[] args) {
        Squid larry = new Squid();

        System.out.println(larry.getTentacleCount());
        System.out.println(larry);

        String s1 = "hello";
        String s2 = new String("hello");

        System.out.println(s1 == s2);

        // == is comparing the "id", in other words the "reference adress"
        // == does not compare content

        // if you want to compare content use the .equals method!

        System.out.println(s1.equals(s2));
    }
}
