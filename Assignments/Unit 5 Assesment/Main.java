import java.util.ArrayList;

public class Main {

    /**
     * Return an ArrayList of monsters for automated testing. Populate this with your created
     * monsters (e.g. Chimera, custom subclasses).
     */
    public static ArrayList<Monster> getMonstersForTest() {

        ArrayList<Monster> list = new ArrayList<>();
        list.add(new Chimera());
        list.add(new Dragon());
        list.add(new Chimera("Joe"));

        return list;
    }

    public static ArrayList<Monster> getDittoBracket() {

        ArrayList<Monster> list = new ArrayList<>();
        for (int h = 10; h <= 250; h += 10) {
            for (int a = 10; h + a <= 250; a += 10) {
                for (int d = 10; h + a + d <= 240; d += 10) {
                    list.add(new Ditto(h, a, d, 250 - h - a - d));
                }
            }
        }

        return list;

        /*
         * Winner: Ditto Stats: h: 200 a: 30 d: 10 s: 10
         */
    }

    public static void main(String[] args) {

        // Run a tournament using monsters from getMonstersForTest():
        ArrayList<Monster> monsters = getMonstersForTest();
        Monster winner = BattleEngine.battleEveryone(monsters);

        System.out.println("Winner: " + (winner != null ? winner.getName() : "None"));
        System.out.println("Stats: \nh: " + winner.health + "\na: " + winner.attack + "\nd: "
                + winner.defense + "\ns: " + winner.speed);

    }
}
