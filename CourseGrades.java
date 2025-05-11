/**
 * The CourseGrades class represents a collection of graded activities for a course.
 * It stores the grades for the lab activity, pass/fail exam, essay, and final exam.
 */
public class CourseGrades {
    private GradedActivity[] grades; // Array to store graded activities

    /**
     * Constructor for the CourseGrades class.
     * Initializes the array to store graded activities.
     */
    public CourseGrades() {
        grades = new GradedActivity[4];
    }

    /**
     * Sets the graded activity for the lab.
     * @param lab The graded activity for the lab
     */
    public void setLab(GradedActivity lab) {
        grades[0] = lab;
        lab.setScore(lab.getScore());
    }

    /**
     * Sets the graded activity for the pass/fail exam.
     * @param exam The graded activity for the pass/fail exam
     */
    public void setPassFailExam(PassFailExam exam) {
        grades[1] = exam;
        exam.setScore(exam.getScore());
    }

    /**
     * Sets the graded activity for the essay.
     * @param essay The graded activity for the essay
     */
    public void setEssay(Essay essay) {
        grades[2] = essay;
        essay.setScore(essay.getScore());
    }

    /**
     * Sets the graded activity for the final exam.
     * @param finalExam The graded activity for the final exam
     */
    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
        finalExam.setScore(finalExam.getScore());
    }

    /**
     * Generates a string representation of the course grades.
     * @return A string containing the scores and letter grades for each graded activity
     */
    @Override
    public String toString() {
        String str = new String("Lab Score: " + grades[0].getScore() + " Grade: " + grades[0].getLetterGrade() + "\n" +
                              "Pass/Fail Exam Score: " + grades[1].getScore() + " Grade: " + grades[1].getLetterGrade() + "\n" +
                              "Essay Score: " + grades[2].getScore() + " Grade: " + grades[2].getLetterGrade() + "\n" +
                              "Final Exam Score: " + grades[3].getScore() + " Grade: " + grades[3].getLetterGrade());
        return str;
    }
}
