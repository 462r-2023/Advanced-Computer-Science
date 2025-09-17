public class Student {
    private String name, id;
    private int grade;
    private Student latestOpp, recentFriend;

    public Student(String name) {
        this.name = name;
        grade = 10;
        id = generateId();
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        id = generateId();
    }

    public Student(String name, Student latestOpp) {
        this.name = name;
        grade = 10;
        id = generateId();
        this.latestOpp = latestOpp;
    }

    public String generateId() {
        String s = "";
        for (int i = 0; i < 7; i++) {
            s += (int) (Math.random() * 10);
            if (i == 2)
                s += "-";
        }
        return s;
    }

    public String vibeCheck(Student other) {
        if (other.getLatestOpp().equals(latestOpp)) {
            recentFriend = other;
            other.recentFriend = this;
            return name + " and " + other.name + " are now friends! They both dislike " + latestOpp
                    + ".";
        }
        return name + " and " + other.name + " have no common opps.";
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, int grade, Student latestOpp) {
        this.name = name;
        this.grade = grade;
        id = generateId();
        this.latestOpp = latestOpp;
    }

    public Student getLatestOpp() {
        return latestOpp;
    }

    public void setLatestOpp(Student latestOpp) {
        this.latestOpp = latestOpp;
    }

    public Student getRecentFriend() {
        return recentFriend;
    }

    public void setRecentFriend(Student recentFriend) {
        this.recentFriend = recentFriend;
    }

    public String toString() {
        return name + " is a " + grade + "th grade student. Their id is " + id + ".";
    }

    public boolean equals(Student other) {
        return name.equals(other.name) && grade == other.grade && id.equals(other.id);
    }
}
