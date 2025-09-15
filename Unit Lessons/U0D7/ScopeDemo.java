public class ScopeDemo {
    private String world = "world"; // instance variable are global

    public static void main(String[] args) {

    }

    public String method2() {
        var hello = "hello";
        return hello;
    }

    public String method1() {
        var hello = "hello";
        return hello + world;
    }
}
