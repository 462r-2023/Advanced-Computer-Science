public class Student implements Comparable {
    private int id;
    private String name;
    private String alphaID;

    public Student(String name, int id, String alphaID) {
        this.name = name;
        this.id = id;
        this.alphaID = alphaID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Object other) {
        return alphaID.compareTo(((Student) other).alphaID);
    }
}
