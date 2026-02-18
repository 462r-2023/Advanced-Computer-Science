public class Frog extends Animal {
    private String color;
    private boolean isMale;
    private int legCount;
    private int jumpHeight;

    public Frog(String name, int age, boolean isMale, String color, int legCount, int jumpHeight) {
        setName(name);
        setAge(age);
        setAlive(true);
        hunger = 0;
        this.isMale = isMale;
        this.color = color;
        this.legCount = legCount;
        this.jumpHeight = jumpHeight;
    }

    public Frog() {
        this("Frog", 0, false, "Green", 4, 0);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void eat() {
        System.out.println("Eating flies");
        hunger = 0;
    }

    public void swim() {
        System.out.println("Swimming");
        hunger += 10;
    }

    public void jump(int height) {
        System.out.println("Jumped " + Math.clamp(jumpHeight, 0, height) + " feet!");
        hunger += 5;
    }

    public void jump() {
        jump(jumpHeight);
    }
}
