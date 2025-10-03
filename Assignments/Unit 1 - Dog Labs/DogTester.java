public class DogTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Dog (from HL2)", "Eli Vance", 20, 207);
        Dog dog3 = new Dog("Dog (not from HL2)", "Bob", 1, 198);

        System.out.println("Dog1: " + dog1);
        System.out.println("Dog2: " + dog2);
        System.out.println("Dog3: " + dog3);


        System.out.println("Dog2 id: " + dog2.getDogId());
        System.out.println("Dog3 id: " + dog3.getDogId());

        dog2.setDogId(123);
        dog3.setDogId(123);

        System.out.println("Dog2 id: " + dog2.getDogId());
        System.out.println("Dog3 id: " + dog3.getDogId());

        System.out.println("Dog1 char: " + Dog.generateDogChar(dog1.getDogId()));
        System.out.println("Dog2 char: " + Dog.generateDogChar(dog1.getDogId()));
        System.out.println("Dog3 char: " + Dog.generateDogChar(dog1.getDogId()));

        System.out.println("Dog1 tag: " + dog1.generateDogTag());
        System.out.println("Dog2 tag: " + dog2.generateDogTag());
        System.out.println("Dog3 tag: " + dog3.generateDogTag());

        System.out.println("Dog1: " + dog1);
        System.out.println("Dog2: " + dog2);
        System.out.println("Dog3: " + dog3);

        System.out.println("Dog1 equals dog2: " + dog1.equals(dog2));
        Dog dog4 = new Dog();
        System.out.println("Dog1 equals dog4: " + dog1.equals(dog4));

        dog3.setStillInFacility(false);
        System.out.println("Dog3: " + dog3);

        System.out.println("Dog2 in facility: " + dog2.isStillInFacility());
        System.out.println(Dog.pickup(dog2, "Eli Vance"));
        System.out.println(Dog.pickup(dog2, "Gordon Freeman"));
        System.out.println(
                "Gordon is a highly trained professional, he doesn't need to hear all this!");
        System.out.println("Dog2 in facility: " + dog2.isStillInFacility());
        Dog.checkIn(dog2, "Alyx Vance");
        System.out.println("Dog2 checked");
        System.out.println("Dog2 in facility: " + dog2.isStillInFacility());
        System.out.println("Dog2 owner: " + dog2.getOwnerName());
    }
}
