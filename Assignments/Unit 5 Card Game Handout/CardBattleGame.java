import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * CardBattleGame — the main game loop (students implement).
 *
 * USEFUL METHODS YOU'LL NEED:
 *
 * Card methods: card.applySelfOnPlay() -> applies shield/bonusDamage from the card's ability
 * card.getAbility().pingDamageOnPlay() -> how much ping damage this ability deals
 * card.getAbility().cyclesOnPlay() -> whether the card cycles to the bottom of the deck
 * card.computeDamageAgainst(defender) -> calculates damage with type multipliers
 * card.takeDamage(amount) -> reduces shield first, then health card.isDefeated() -> true if health
 * <= 0 card.getType() -> returns CardType (uses polymorphism!)
 *
 * PlayerState methods: state.getDeck() -> returns the player's ArrayList<Card> state.getActive() /
 * setActive(card) -> the currently active card (or null) state.hasAnythingLeft() -> true if active
 * card or cards remain in deck state.getPendingDamage() / setPendingDamage(int) -> stored Ripple
 * damage for next drawn card
 */
public class CardBattleGame {

    // To-do: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        PlayerState p1;
        PlayerState p2;
        if (rng.nextInt() % 2 == 0) {
            p1 = new PlayerState("Player", playerDeck);
            p2 = new PlayerState("Bot", botDeck);
        } else {
            p1 = new PlayerState("Bot", playerDeck);
            p2 = new PlayerState("Player", botDeck);
        }

        while (p1.hasAnythingLeft() && p2.hasAnythingLeft()) {
            if (p1.getActive() == null) {
                p1.setActive(p1.getDeck().get(0));
                p1.getDeck().remove(0);
                p1.getActive().applySelfOnPlay();
                p1.getActive().takeDamage(p1.getPendingDamage());
                p1.setPendingDamage(0);
            }
            p2.getActive().takeDamage(p1.getActive().computeDamageAgainst(p2.getActive()));
            if (p2.getActive().isDefeated()) {
                p2.setActive(null);
            }
            if (p2.getActive() == null) {
                p2.setPendingDamage(p1.getActive().getAbility().pingDamageOnPlay());
            } else {
                p2.getActive().takeDamage(p1.getActive().getAbility().pingDamageOnPlay());
                if (p2.getActive().isDefeated()) {
                    p2.setActive(null);
                }
            }

            if (p2.getActive() == null) {
                p2.setActive(p2.getDeck().get(0));
                p2.getDeck().remove(0);
                p2.getActive().applySelfOnPlay();
                p2.getActive().takeDamage(p2.getPendingDamage());
                p2.setPendingDamage(0);
            }
            p1.getActive().takeDamage(p2.getActive().computeDamageAgainst(p1.getActive()));
            if (p1.getActive().isDefeated()) {
                p1.setActive(null);
            }
            if (p1.getActive() == null) {
                p1.setPendingDamage(p2.getActive().getAbility().pingDamageOnPlay());
            } else {
                p1.getActive().takeDamage(p2.getActive().getAbility().pingDamageOnPlay());
                if (p1.getActive().isDefeated()) {
                    p1.setActive(null);
                }
            }
        }

        String s = "== CARD CLASH == Starting: " + p1.getName() + " Winner: "
                + (p1.hasAnythingLeft() ? p1.getName() : p2.getName());
        System.out.println(s);
        return s;
    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects via card.applySelfOnPlay()
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        // To-Do: implement the method
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        // To-Do: implement the method
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DeckValidator.buildDefaultDeck();
        ArrayList<Card> bot = DeckBuilderBot.buildBotDeck();

        if (!DeckValidator.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}
