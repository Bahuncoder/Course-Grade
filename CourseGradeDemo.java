/**
*Description: This program demonstrates the usage 
*of the CourseGrades
*class by creating graded activities for a course,
*including a lab activity, pass/fail exam, essay, and final exam. 
*It calculates the grades for each activity based on the provided scores and displays them.
*
*Class: Fall - COSC 1437.82013
*Assignment9:Course Grade
*Date: 04/29/2024
*@author Sudip Paudel
*@version 0.0.0
*/ 
/**
 * The CourseGradeDemo class demonstrates the usage of the CourseGrades class by creating graded activities
 * and setting them in a CourseGrades object.
 */
public class CourseGradeDemo {
    /**
     * The main method creates instances of graded activities and sets them in a CourseGrades object.
     * It then prints out the grades using the toString method of the CourseGrades object.
     * @param args Command-line arguments (not used)
     */
    public static void main(String args[]) {
        // Create a graded activity for the lab
        GradedActivity lab = new GradedActivity();
        lab.setScore(85);

        // Create a pass/fail exam with 20 questions, 3 points each, and a passing score of 70
        PassFailExam pfexam = new PassFailExam(20, 3, 70);

        // Create an essay with specific points for grammar, spelling, length, and content
        Essay essay = new Essay();
        essay.setEssayvalues(25, 18, 17, 20);

        // Create a final exam with 50 questions, 10 points each
        FinalExam finalExam = new FinalExam(50, 10);

        // Create a CourseGrades object and set the graded activities
        CourseGrades course = new CourseGrades();
        course.setLab(lab);
        course.setPassFailExam(pfexam);
        course.setEssay(essay);
        course.setFinalExam(finalExam);

        // Print out the grades using the toString method of the CourseGrades object
        System.out.println(course);
    }
}
