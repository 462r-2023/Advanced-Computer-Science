public class Ditto extends Monster {

    public Ditto(String name, int health, int attack, int defense, int speed) {
        super(name, ElementType.EARTH, health, attack, defense, speed, "Burn", "Splash",
                ElementType.FIRE, ElementType.WATER);
        if (name == null) {
            throw new IllegalArgumentException("Chimera name cannot be null!");
        }
    }

    public Ditto(String name) {
        this(name, 70, 30, 50, 50);
    }

    public Ditto(int health, int attack, int defense, int speed) {
        this("Ditto", health, attack, defense, speed);
    }

    public Ditto() {
        this("Ditto");
    }

    public String victoryNoise() {
        return ".!";
    }
}
