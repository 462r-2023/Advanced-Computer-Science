import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog.toString());

        Rottweiler dog2 = new Rottweiler();
        System.out.println(dog2.toString());

        Shitzu shitzu = new Shitzu();

        ArrayList<Dog> dogList = new ArrayList<Dog>();
        dogList.add(dog2);
        dogList.add(shitzu);
    }
}
