public class Skeleton {
    private String boneColor;
    private int boneCount;
    private int bestByYear;

    public Skeleton() {
        boneColor = "white";
        boneCount = 206;
        bestByYear = 2905;
    }

    public Skeleton(String boneColor, int boneCount, int bestByYear) {
        this.boneColor = boneColor;
        this.boneCount = boneCount;
        this.bestByYear = bestByYear;
    }

    public String getBoneColor() {
        return boneColor;
    }

    public String setBoneColor(String boneColor) {
        // instance variable is assigned to local input boneColor
        return this.boneColor = boneColor;
    }

    public boolean equals(Skeleton other) {
        return boneColor.equals(other.boneColor) && boneCount == other.boneCount
                && bestByYear == other.bestByYear;
    }
}
