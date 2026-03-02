public class Frog extends Animal implements Swimmable, Predator, Pettable {
    private String color;
    private boolean isMale;
    private int legCount;
    private int jumpHeight;

    public Frog(String name, boolean isMale, String color, int legCount, int jumpHeight) {
        super(name, "Anura", "Bufonidae", "Ceratophryidae", "Frog", "Swamp");
        this.isMale = isMale;
        this.color = color;
        this.legCount = legCount;
        this.jumpHeight = jumpHeight;
    }

    public Frog() {
        this("Frog", false, "Green", 4, 0);
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
        System.out.println("Eating food");
    }

    public String getPrimaryPrey() {
        return "Flies";
    }

    public double getAveragePreyMass() {
        return 0.001;
    }

    public void stalkPrey() {
        System.out.println("Stalking flies");
    }

    public void attackPrey() {
        System.out.println("Attacking flies");
    }

    public void eatPrey() {
        System.out.println("Eating flies");
    }

    public double getSwimSpeed() {
        return 3.0;
    }

    public double getPreferredDepth() {
        return 0;
    }

    public void enterWater() {
        System.out.println("Jumped into the water");
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void exitWater() {
        System.out.println("Jumped out of the water");
    }

    public void jump(int height) {
        System.out.println("Jumped " + Math.clamp(jumpHeight, 0, height) + " feet!");
    }

    public void jump() {
        jump(jumpHeight);
    }

    public String toString() {
        return "Frog \"" + getName() + "\"";
    }

    public int getFriendlinessLevel() {
        return 5;
    }

    public int getEnergyLevel() {
        return 7;
    }

    public void greetHuman() {
        System.out.println("\"Howdy!\"");
    }

    public void bePetted() {
        System.out.println("Jumps for joy");
    }

    public void playWithHuman() {
        System.out.println("Jumps to conclusions");
    }

    public String getFact(int index) {
        if (index == 0) {
            return "Frogs can escape at coolbobgames.itch.io/frog-escape";
        }
        if (index == 1) {
            return "Frogs can escape a second time at coolbobgames.itch.io/frog-escape-2";
        }
        if (index == 2) {
            return "Frogs can escape a third time at coolbobgames.itch.io/frog-escape-3";
        }
        if (index == 3) {
            return "Gex is not a frog, but rather a gecko.";
        }
        return "Croc is not a frog, but rather a crocodile.";
    }

    public String getFact() {
        return getFact((int) (Math.random() * 5));
    }

    public void makeSound() {
        System.out.println("Ribbit");
    }

    public void move() {
        System.out.println("Walked");
    }

    public String getSoundDescription() {
        return "Loud and frequent";
    }

    public String getEatDescription() {
        return "Eats with tounge";
    }

    public String getMoveDescription() {
        return "Walks slowly";
    }
}
