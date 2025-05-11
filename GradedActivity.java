/**
 * The GradedActivity class represents a graded activity with a numerical score and a corresponding letter grade.
 */
public class GradedActivity {
    private double score; // Stores the numerical score of the graded activity

    /**
     * Sets the numerical score of the graded activity.
     * @param s The numerical score to set
     */
    public void setScore(double s) {
        score = s;
    }

    /**
     * Retrieves the numerical score of the graded activity.
     * @return The numerical score of the graded activity
     */
    public double getScore() {
        return score;
    }

    /**
     * Calculates and returns the letter grade corresponding to the numerical score.
     * @return The letter grade based on the score
     */
    public char getLetterGrade() {
        char letterGrade;
        if (score > 89)
            letterGrade = 'A';
        else if (score > 79)
            letterGrade = 'B';
        else if (score > 69)
            letterGrade = 'C';
        else if (score > 59)
            letterGrade = 'D';
        else
            letterGrade = 'F';
        return letterGrade;
    }
}
