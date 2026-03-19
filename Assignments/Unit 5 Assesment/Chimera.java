public class Chimera extends Monster {

    public Chimera(String name) {
        super(name, ElementType.FIRE, 50, 50, 50, 50, "Bite", "Kick", ElementType.FIRE,
                ElementType.EARTH);
        if (name == null) {
            throw new IllegalArgumentException("Chimera name cannot be null!");
        }
    }

    public Chimera() {
        this("Chimera");
    }

    public String victoryNoise() {
        return "Roar!";
    }
}
