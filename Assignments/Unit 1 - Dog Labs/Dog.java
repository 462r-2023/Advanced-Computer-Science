public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        dogChar = Dog.generateDogChar(dogId);
        dogTag = generateDogTag();
        stillInFacility = true;
    }

    public Dog() {
        this.name = "";
        this.ownerName = "";
        this.age = 0;
        this.dogId = 0;
        dogChar = Dog.generateDogChar(dogId);
        dogTag = generateDogTag();
        stillInFacility = true;
    }

    public static char generateDogChar(int dogId) {
        return (char) (70 + ((dogId + dogId / 10 + dogId / 100) % 10));
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.ownerName == personName) {
            dog.stillInFacility = false;
            return dog.name + " has been picked up by their owner " + dog.ownerName + ".";
        } else {
            return dog.name + " may only be picked up by their owner " + dog.ownerName + "!";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.stillInFacility = true;
        dog.ownerName = personName;
    }

    public String generateDogTag() {
        return dogChar + "" + dogId;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAge() {
        return age;
    }

    public int getDogId() {
        return dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        String inFacilityStr = "";
        if (stillInFacility) {
            inFacilityStr = "not";
        }
        return name + " is a good dog. They are " + age + " years old and belong to " + ownerName
                + ". They are currently " + inFacilityStr
                + " in our facility. For employee use only: DogTag is " + dogTag + ".";
    }

    boolean equals(Dog other) {
        return name == other.name && ownerName == other.ownerName && age == other.age
                && dogId == other.dogId && dogChar == other.dogChar && dogTag == other.dogTag
                && stillInFacility == other.stillInFacility;
    }
}
