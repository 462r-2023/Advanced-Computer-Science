public class Player {
    private String name;
    private String choice;

    public String getChoice() {
        return choice.toLowerCase();
    }

    public void setChoice(String choice) {
        if (RPSGame.validateChoice(choice)) {
            this.choice = choice.toLowerCase();
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " chose " + choice + ".";
    }
}
