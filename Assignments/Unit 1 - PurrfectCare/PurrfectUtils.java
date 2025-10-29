public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() > 7) {
            return "Currently, Cookie is in a great mood.\nPetting is appreciated.";
        }
        if (cat.getMoodLevel() > 3) {
            return "Currently, Cookie is reminiscing of a past life.\nPetting is acceptable.";
        }
        return "Currently, Cookie is plotting revengeance.\nPetting is extremely risky.";
    }

    public static char generateCatChar(String catId) {
        int current = 0;
        for (int i = 0; i < catId.length(); i++) {
            current += Integer.parseInt(catId.substring(i, i + 1));
        }
        return (char) (65 + ((current) % 26));
    }

    public static int generateRandomNumber(int min, int max) {
        if (max < min) {
            return (int) (Math.random() * (min - max)) + max;
        }
        return (int) (Math.random() * (max - min)) + min;
    }

    public static String validateCatId(String catId) {
        if (Integer.parseInt(catId) < 1000 || Integer.parseInt(catId) > 9999) {
            return "" + generateRandomNumber(1000, 10000);
        }
        return catId;
    }

    public static int validateMoodLevel(int moodLevel) {
        return Math.max(0, Math.min(moodLevel, 10));
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat);
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() < 2 && cat.isHungry()) {
            System.out.println("Petting failed...");
            cat.setMoodLevel(cat.getMoodLevel() - 1);
        } else {
            System.out.println("Petting successful!");
            cat.setMoodLevel(cat.getMoodLevel() + 1);
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        if (generateRandomNumber(0, 1) == 0) {
            System.out.println(cat.getName() + " did not like that...");
            cat.setMoodLevel(cat.getMoodLevel() - 1);
        } else {
            System.out.println(cat.getName() + " really hated that!");
            cat.setMoodLevel(cat.getMoodLevel() - 2);
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println(
                "Cleaning the litter box...\nDone!\n" + cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Filling up " + cat.getName() + "'s bowl...\nDone!\n" + cat.getName()
                + " is eating...\n" + cat.getName() + " is full!");
    }
}
