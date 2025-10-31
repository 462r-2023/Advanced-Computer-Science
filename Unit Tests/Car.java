public class Car {
    private String model;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsOilChange;

    public Car(String model, String ownerName, int cleanlinessLevel) {
        this.model = model;
        this.ownerName = AutoUtils.fixName(ownerName);
        username = AutoUtils.generateUsername(this.ownerName);
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public Car() {
        model = "";
        ownerName = "John Driver";
        username = AutoUtils.generateUsername(ownerName);
        cleanlinessLevel = 5;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

    public String getModel() {
        return model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getUsername() {
        return username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public boolean isNeedsOilChange() {
        return needsOilChange;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = AutoUtils.fixName(ownerName);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public String toString() {
        String output = "== ABOUT CAR ==\nModel: " + model + "\nOwner: " + ownerName
                + "\nUsername: " + username + "\nCleanliness Level: " + cleanlinessLevel
                + "\nDoes car need oil change? ";
        if (needsOilChange) {
            output += "Yes";
        } else {
            output += "No";
        }
        return output;
    }

    public boolean equals(Car other) {
        return model.equals(other.model) && ownerName.equals(other.ownerName)
                && username.equals(other.username) && cleanlinessLevel == other.cleanlinessLevel
                && needsOilChange == other.needsOilChange;
    }
}
