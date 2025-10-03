public class Demo {

    private int hello;
    private int world;
    private String goodbye;

    public static void main(String[] args) {
        // AND - ALL conditions have to be true
        int age = 20;
        boolean isFelon = false;

        if ((age >= 18 && age >= 35) && !isFelon) {
            System.err.println("You can run for presidency and vote!");
        }

        // OR - at least one condition has to be true

        age = 15;

        if (age < 35 || (isFelon || age > 101)) {
            System.err.println("This person is not elligible for presidency");
        }

        // READABILITY IS IMPORTANT

        boolean isRegistered = true;
        boolean isCitizen = true;
        String country = "USA";

        if (isRegistered) {
            if (age >= 18) {
                if (isCitizen && !isFelon) {
                    if (country.equals("USA")) {
                        System.out.println("You can vote!");
                    }
                }
            }
        }

        // Guarding If statements
        if (!isRegistered) {
            return;
        }
        if (age < 18) {
            return;
        }
        if (!isCitizen || isFelon) {
            return;
        }
        if (country.equals("USA")) {
            return;
        }
        System.out.println("You can vote!");
    }

    public void setHello(int hello) {
        this.hello = hello;
    }

    public void setWorld(int world) {
        this.world = world;
    }

    public void setGoodbye(String goodbye) {
        this.goodbye = goodbye;
    }

    public int getHello() {
        return hello;
    }

    public int getWorld() {
        return world;
    }

    public String getGoodbye() {
        return goodbye;
    }
}
