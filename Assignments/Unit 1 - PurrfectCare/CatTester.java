public class CatTester {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat", "Dog", 5, "2763");

        System.out.println("Name: " + cat.getName());
        System.out.println("Owner name: " + cat.getOwnerName());
        System.out.println("Mood level: " + cat.getMoodLevel());
        System.out.println("Cat id: " + cat.getCatId());
        System.out.println("Cat char: " + cat.getCatChar());
        System.out.println("Cat tag: " + cat.generateCatTag());
        System.out.println("Cat is hungry: " + cat.isHungry());

        cat.setName("Garfield");
        cat.setOwnerName("Jon");
        cat.setMoodLevel(1);
        cat.setCatId("1111");
        cat.setHungry(false);

        System.out.println("Name: " + cat.getName());
        System.out.println("Owner name: " + cat.getOwnerName());
        System.out.println("Mood level: " + cat.getMoodLevel());
        System.out.println("Cat id: " + cat.getCatId());
        System.out.println("Cat char: " + cat.getCatChar());
        System.out.println("Cat tag: " + cat.generateCatTag());
        System.out.println("Cat is hungry: " + cat.isHungry());

        Cat cat2 = new Cat("Garfield", "Jon", 1, "2763");
        System.out.println("Cat equals cat2: " + cat.equals(cat2));

        PurrfectUtils.bootUp(cat);
        PurrfectUtils.pet(cat);
        PurrfectUtils.trimClaws(cat);
        PurrfectUtils.cleanLitterBox(cat);
        PurrfectUtils.feed(cat);
    }
}
