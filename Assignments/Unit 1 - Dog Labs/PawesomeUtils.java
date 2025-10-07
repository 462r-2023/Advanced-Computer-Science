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
        dog.setStillInFacility(true);
        dog.setOwnerName(personName);
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
}
