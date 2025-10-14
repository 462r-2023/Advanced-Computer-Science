public class PawesomeUtils {
    public static char generateDogChar(int dogId) {
        return (char) (70 + ((dogId + dogId / 10 + dogId / 100) % 10));
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return dogId + "" + dogChar;
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName() == personName) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + dog.getOwnerName() + ".";
        } else {
            return dog.getName() + " may only be picked up by their owner " + dog.getOwnerName()
                    + "!";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        if (PawesomeUtils.validateDogTag(dog)) {
            System.out.println(dog.getName() + " is real and was allowed into the daycare.");
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
        } else {
            System.out.println(
                    dog.getName() + " is counterfeit and was NOT allowed into the daycare.");
        }
    }

    public static int validateDogId(int dogId) {
        if (dogId > 99 && dogId < 1000) {
            return dogId;
        }
        return (int) (Math.random() * 900) + 100;
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = validateDogId(dog.getDogId());
        String newDogTag = dogId + "" + generateDogChar(dogId);
        System.out.println(newDogTag + " " + dog.getDogTag());
        return newDogTag.equals(dog.getDogTag());
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 0) {
            return 0;
        }
        if (dog.getAge() == 1) {
            return 15;
        }
        return 24 + (dog.getAge() - 2) * 5;
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears == 0) {
            return 0;
        }
        if (humanYears < 15) {
            return 1;
        }
        if (humanYears < 24) {
            return 2;
        }
        return (humanYears - 24) / 5 + 3;
    }
}
