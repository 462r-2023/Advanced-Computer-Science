import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC npc;

    public RPSGame(Player player, NPC npc) {
        this.player = player;
        this.npc = npc;
    }

    public void start() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = keyboard.next();
        System.out.println("Enter your choice:");
        String choice = keyboard.next();
        for (int i = 0; i < 3; i++) {
            if (validateChoice(choice)) {
                break;
            } else if (i == 2) {
                choice = generateRandomChoice();
                System.out.println("Invalid. Your choice will be set to " + choice + ".");
            } else {
                System.out.println("Invalid. Enter your choice:");
                choice = keyboard.next();
            }
        }
        setPlayerValues(name, choice);
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals("rock") && npc.getChoice().equals("scissors")) {
            return true;
        }
        if (player.getChoice().equals("scissors") && npc.getChoice().equals("paper")) {
            return true;
        }
        if (player.getChoice().equals("paper") && npc.getChoice().equals("rock")) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (didPlayerWin()) {
            return player.getName() + " won!\nCongratulations!";
        }
        return "Opponent won!\nBetter luck next time!";
    }

    public String displayResults() {
        return "== GAME RESULTS ==" + player.getName() + " chose " + player.getChoice()
                + ".\nOpponent chose " + npc.getChoice() + ".\n" + toString();
    }

    public Player getPlayer() {
        return player;
    }

    public NPC getOpponent() {
        return npc;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setOpponent(NPC npc) {
        this.npc = npc;
    }

    public static boolean validateChoice(String choice) {
        return (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"));
    }

    public static String generateRandomChoice() {
        if (Math.random() * 3 < 1.0) {
            return "rock";
        } else if (Math.random() * 2 < 1.0) {
            return "paper";
        }
        return "scissors";
    }
}
