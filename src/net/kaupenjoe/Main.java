package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* METHODS */

        String[] que = new String[3];
        que[0] = "How many States does the USA have?";
        que[1] = "What is the Capital of the United Kingdom";
        que[2] = "What is the chemical symbol for Iron";

        String[] ans = new String[3];
        ans[0] = "50";
        ans[1] = "London";
        ans[2] = "Fe";

        outputQuestionsAndAnswers(que, ans);
        System.out.println(sum(10, 12));
    }

    public static void outputQuestionsAndAnswers(String[] questions, String[] answers) {
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
