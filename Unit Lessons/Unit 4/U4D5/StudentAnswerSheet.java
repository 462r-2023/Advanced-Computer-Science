import java.util.ArrayList;

public class StudentAnswerSheet {
    String name;
    double testScore;
    ArrayList<String> answers;

    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (name == null || answers == null) {
            throw new IllegalArgumentException("Argument cannot be null!");
        }
        this.name = name;
        this.answers = answers;
        testScore = 0.0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public double getGrade(ArrayList<String> key) {
        if (key == null) {
            throw new IllegalArgumentException("Argument cannot be null!");
        }
        if (answers.size() != key.size()) {
            throw new IllegalArgumentException(
                    "The number of scores must match the number of answers!");
        }
        double score = 0.0;
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i) == null || key.get(i) == null) {
                throw new IllegalArgumentException("Answer or solution value cannot be null!");
            }
            if (answers.get(i).equals(key.get(i))) {
                score++;
            } else if (!answers.get(i).equals("?")) {
                score -= 0.25;
            }
        }
        return score;
    }
}
