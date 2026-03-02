public class Jellyfish extends Animal implements Swimmable, Predator {
    private String bodyColor;
    private String tentacleColor;
    private int tentacleCount;
    private int tentacleLength;

    public Jellyfish(String name, String bodyColor, String tentacleColor, int tentacleCount,
            int tentacleLength) {
        super(name, "Rhizostomeae", "Lepocreadiidae", "Scyphozoa", "Jellyfish", "Ocean");
        this.bodyColor = bodyColor;
        this.tentacleColor = tentacleColor;
        this.tentacleCount = tentacleCount;
        this.tentacleLength = tentacleLength;
    }

    public Jellyfish() {
        this("Jellyfish", "Pink", "White", 100, 4);
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getTentacleColor() {
        return tentacleColor;
    }

    public void setTentacleColor(String tentacleColor) {
        this.tentacleColor = tentacleColor;
    }

    public int getTentacleCount() {
        return tentacleCount;
    }

    public void setTentacleCount(int tentacleCount) {
        this.tentacleCount = tentacleCount;
    }

    public int getTentacleLength() {
        return tentacleLength;
    }

    public void setTentacleLength(int tentacleLength) {
        this.tentacleLength = tentacleLength;
    }

    public void eat() {
        System.out.println("Eating food");
    }

    public String getPrimaryPrey() {
        return "Fish";
    }

    public double getAveragePreyMass() {
        return 1;
    }

    public void stalkPrey() {
        System.out.println("Stalking fish");
    }

    public void attackPrey() {
        System.out.println("Attacking fish");
    }

    public void eatPrey() {
        System.out.println("Eating fish");
    }

    public double getSwimSpeed() {
        return 2.0;
    }

    public double getPreferredDepth() {
        return 50;
    }

    public void enterWater() {
        System.out.println("Fell into the water");
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void exitWater() {
        System.out.println("Was beached");
    }

    public void sting(int distance) {
        System.out.println("Stung " + Math.clamp(distance, 0, tentacleLength) + " feet away.");
    }

    public void sting() {
        sting(tentacleLength);
    }

    public String toString() {
        return "Jellyfish \"" + getName() + "\"";
    }

    public String getFact(int index) {
        if (index == 0) {
            return "Moon jellyfish are a species of jellyfish that do not live on the moon.";
        }
        if (index == 1) {
            return "Jellyfish locomotion is highly efficient as muscles in the jellylike bell contract in order to create a vortex which propels the animal.";
        }
        if (index == 2) {
            return "Jellyfish cannot drive.";
        }
        if (index == 3) {
            return "Some jellyfish reset their age to live forever.";
        }
        return "Most jellyfish have over two tentacles.";
    }

    public String getFact() {
        return getFact((int) (Math.random() * 5));
    }

    public void makeSound() {
        System.out.println("Swish swish");
    }

    public void move() {
        System.out.println("Moved tentacles");
    }

    public String getSoundDescription() {
        return "Extremely quiet";
    }

    public String getEatDescription() {
        return "Consumes with tentacles";
    }

    public String getMoveDescription() {
        return "Moves tentacles slowly";
    }
}
