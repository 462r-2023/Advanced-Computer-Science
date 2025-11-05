public class NPC {
    private String choice;

    public NPC() {
        choice = RPSGame.generateRandomChoice();
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        if (RPSGame.validateChoice(choice)) {
            this.choice = choice;
        }
    }

    public String toString() {
        return "Opponent chose " + choice + ".";
    }
}
