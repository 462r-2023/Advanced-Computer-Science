public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = moodLevel;
        this.catId = catId;
        catChar = PurrfectUtils.generateCatChar(catId);
        isHungry = true;
    }

    public Cat() {
        this.name = "";
        this.ownerName = "";
        this.moodLevel = 5;
        setCatId("0");
        catChar = PurrfectUtils.generateCatChar(catId);
        isHungry = true;
    }

    public String generateCatTag() {
        return catId + catChar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
        catChar = PurrfectUtils.generateCatChar(catId);
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
        this.catChar = PurrfectUtils.generateCatChar(catId);
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public String getCatId() {
        return catId;
    }

    public char getCatChar() {
        return catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String toString() {
        return "== ABOUT " + name.toUpperCase() + " ==\n" + name + " is a cat.\nTheir tag is "
                + generateCatTag() + ".\nCurrently, " + name + " is in a great mood.\n"
                + PurrfectUtils.determineCatMood(this);
    }

    public boolean equals(Cat other) {
        return name.equals(other.name) && ownerName.equals(other.ownerName)
                && moodLevel == other.moodLevel && catId.equals(other.catId)
                && catChar == other.catChar && isHungry == other.isHungry;
    }
}
