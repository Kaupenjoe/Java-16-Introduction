package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* BOOLEAN AND COMPARISON OPERATORS  */

        boolean likesTheLectures = true;
        boolean askedQuestion = false;

        System.out.println("You like these lectures " + likesTheLectures);
        System.out.println("You have asked a Question in the Q&A " + askedQuestion);

        // COMPARISON OPERATORS
        // > >= == != < <=

        int yourScore = 98;

        boolean passedClass = yourScore >= 50;
        System.out.println("You passed: " + passedClass + " with " + yourScore + " points!");

        boolean hasPerfectScore = yourScore == 100;
        boolean failedClass = !passedClass;
        // true -> false
        // false -> true
    }
}
