import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Must have positive number of rows and columns!");
        }
        kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Animal cannot be null!");
        }
        for (int row = 0; row < kennels.length; row++) {
            for (int col = 0; col < kennels[row].length; col++) {
                if (kennels[row][col] == null) {
                    kennels[row][col] = animal;
                    return;
                }
            }
        }
        System.out.println("No empty kennels.");
    }


    public void add(Dog animal, int row, int col) {
        if (animal == null) {
            throw new IllegalArgumentException("Animal cannot be null!");
        }
        if (row < 0 || col < 0 || row >= kennels.length || col >= kennels[0].length) {
            throw new IllegalArgumentException("Indexes must be valid!");
        }
        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }
    }

    public void add(ArrayList<Dog> animals) {
        if (animals == null) {
            throw new IllegalArgumentException("Animals ArrayList cannot be null!");
        }
        for (int i = 0; i < animals.size(); i++) {
            add(animals.get(i));
        }
    }

    public Dog adopt(int row, int col) {
        if (row < 0 || col < 0 || row >= kennels.length || col >= kennels[0].length) {
            throw new IllegalArgumentException("Indexes must be valid!");
        }
        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("Kennel cannot be empty!");
        }
        Dog dog = kennels[row][col];
        kennels[row][col] = null;
        return dog;
    }

    public ArrayList<Dog> search(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        for (int row = 0; row < kennels.length; row++) {
            for (int col = 0; col < kennels[row].length; col++) {
                if (kennels[row][col] != null && kennels[row][col].getName().equals(name)) {
                    dogList.add(kennels[row][col]);
                }
            }
        }
        return dogList;
    }

    public ArrayList<Dog> search(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        for (int row = 0; row < kennels.length; row++) {
            for (int col = 0; col < kennels[row].length; col++) {
                if (kennels[row][col] != null && kennels[row][col].getAge() == age) {
                    dogList.add(kennels[row][col]);
                }
            }
        }
        return dogList;
    }
}
