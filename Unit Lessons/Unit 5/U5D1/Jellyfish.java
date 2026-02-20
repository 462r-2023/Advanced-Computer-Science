public class Jellyfish extends Animal {
    private String bodyColor;
    private String tentacleColor;
    private int tentacleCount;
    private int tentacleLength;

    public Jellyfish(String name, int age, String bodyColor, String tentacleColor,
            int tentacleCount, int tentacleLength) {
        setName(name);
        setAge(age);
        setAlive(true);
        hunger = 0;
        this.bodyColor = bodyColor;
        this.tentacleColor = tentacleColor;
        this.tentacleCount = tentacleCount;
        this.tentacleLength = tentacleLength;
    }

    public Jellyfish() {
        this("Jellyfish", 0, "Pink", "White", 100, 4);
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

    public void feed() {
        System.out.println("Eating fish");
        hunger = 0;
    }

    public void swim() {
        System.out.println("Swimming");
        hunger += 10;
    }

    public void sting(int distance) {
        System.out.println("Stung " + Math.clamp(distance, 0, tentacleLength) + " feet away.");
        hunger += 5;
    }

    public void sting() {
        sting(tentacleLength);
    }

    public void resetAge() {
        setAge(0);
    }

    public String toString() {
        return "Jellyfish \"" + getName() +"\"";
    }
}
