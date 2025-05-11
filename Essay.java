/**
 * The Essay class represents an essay assignment, which is a type of GradedActivity.
 * It extends the GradedActivity class to inherit its properties and methods.
 */
public class Essay extends GradedActivity {
    private int grammerPoints; // Stores the points for grammar
    private int spellingPoints; // Stores the points for spelling
    private int lengthPoints; // Stores the points for length
    private int contentPoints; // Stores the points for content

    /**
     * Default constructor for the Essay class.
     * Initializes all points to zero.
     */
    public Essay() {
        this.grammerPoints = 0;
        this.spellingPoints = 0;
        this.lengthPoints = 0;
        this.contentPoints = 0;
    }

    /**
     * Parameterized constructor for the Essay class.
     * Initializes points for grammar, spelling, length, and content.
     * @param grammerPoints The points for grammar
     * @param spellingPoints The points for spelling
     * @param lengthPoints The points for length
     * @param contentPoints The points for content
     */
    public Essay(int grammerPoints, int spellingPoints, int lengthPoints, int contentPoints) {
        this.grammerPoints = grammerPoints;
        this.spellingPoints = spellingPoints;
        this.lengthPoints = lengthPoints;
        this.contentPoints = contentPoints;
    }

    /**
     * Method to set the values of essay points.
     * @param grammerPoints The points for grammar
     * @param spellingPoints The points for spelling
     * @param lengthPoints The points for length
     * @param contentPoints The points for content
     */
    public void setEssayvalues(int grammerPoints, int spellingPoints, int lengthPoints, int contentPoints) {
        this.grammerPoints = grammerPoints;
        this.spellingPoints = spellingPoints;
        this.lengthPoints = lengthPoints;
        this.contentPoints = contentPoints;
        int tot = grammerPoints + spellingPoints + lengthPoints + contentPoints;
        super.setScore(tot); // Set the total score of the essay
    }

    /**
     * Getter method for grammar points.
     * @return The points for grammar
     */
    public int getGrammerPoints() {
        return grammerPoints;
    }

    /**
     * Getter method for spelling points.
     * @return The points for spelling
     */
    public int getSpellingPoints() {
        return spellingPoints;
    }

    /**
     * Getter method for length points.
     * @return The points for length
     */
    public int getLengthPoints() {
        return lengthPoints;
    }

    /**
     * Getter method for content points.
     * @return The points for content
     */
    public int getContentPoints() {
        return contentPoints;
    }

    /**
     * Method to calculate and return the total score of the essay.
     * @return The total score of the essay
     */
    public double getTotalScore() {
        return grammerPoints + spellingPoints + lengthPoints + contentPoints;
    }
}
