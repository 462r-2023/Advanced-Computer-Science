public abstract class Animal {

    // common instance variables
    private double age;
    private String name;
    private boolean isAlive;
    protected int hunger;

    // common abstract methods
    public abstract void eat();

    public void die() {
        System.out.println(name + " died.");
        isAlive = false;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
}
