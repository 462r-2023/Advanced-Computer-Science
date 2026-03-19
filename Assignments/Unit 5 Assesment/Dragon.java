public class Dragon extends Monster {

    public Dragon(String name) {
        super(name, ElementType.AIR, 70, 30, 30, 70, "Flame", "Flap", ElementType.FIRE,
                ElementType.AIR);
        if (name == null) {
            throw new IllegalArgumentException("Chimera name cannot be null!");
        }
    }

    public Dragon() {
        this("Dragon");
    }

    public String victoryNoise() {
        return "Yipee!";
    }
}
