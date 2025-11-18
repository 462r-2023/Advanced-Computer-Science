public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    public int getTestScore(int testNumber) {
        if (testNumber >= scores.length || testNumber < 0) {
            return -1;
        }
        return scores[testNumber];
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // inherited methods
    public String toString() {
        String s = name + "'s scores: [";
        for (int i = 0; i < scores.length; i++) {
            s += scores[i];
            if (i < scores.length - 1) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }

    public boolean equals(StudentRecord other) {
        if (!name.equals(other.name) || scores.length != other.scores.length) {
            return false;
        }
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != other.scores[i]) {
                return false;
            }
        }
        return true;
    }

    // methods

    /*
     * returns the average (arithmetic mean) of the values in scores precondition: 0 <= first < last
     * < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        double sum = 0;
        for (int i = first; i < last && i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / (last - first);
    }

    /*
     * Determines if each successive value in scores is greater than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        int last = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score < last) {
                return false;
            }
            last = score;
        }
        return true;
    }

    /*
     * The method determines if the student has improved and returns the average score
     * appropriately: If the student has improved, returns the average of the top half of the scores
     * array. Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        if (hasImproved()) {
            return getAverage(scores.length / 2, scores.length);
        }
        return getAverage(0, scores.length);
    }

}
