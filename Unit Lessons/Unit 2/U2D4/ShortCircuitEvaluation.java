public class ShortCircuitEvaluation {
    public static void main(String[] args) {

        String[] names = {"Henry", "Crystal", "Boyan", "Daniel", "Owen", null, "Ava", "Morgan"};

        // count how many students are in the list

        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (!(names[i] == null || names[i].length() == 0)) { // short circuit evaluation
                count++;
            }
        }

        System.out.println(count);

        // short circuit evaluation

        // T && T -> true
        // F && ?? -> false (skips the second condition)

        // T && ?? -> true (skips the second condition)
        // F && F -> false

    }
}
