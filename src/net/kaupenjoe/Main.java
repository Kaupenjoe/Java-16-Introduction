package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* BOOLEAN AND LOGICAL OPERATORS */

        boolean watchedLectures = true;
        boolean askedQuestion = false;
        boolean finishedAssignments = true;
        boolean gaveReview = false;

        // Logical Operators
        // && (AND)
        // || (OR)
        // ! (NOT)

        boolean finishedCourse = watchedLectures && finishedAssignments;
        boolean isFan = finishedCourse && gaveReview;
        boolean learning = watchedLectures || askedQuestion;

    }
}
