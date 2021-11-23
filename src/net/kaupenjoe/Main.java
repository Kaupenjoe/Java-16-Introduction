package net.kaupenjoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXCEPTIONS AND TRY & CATCH */

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        // checkForZero(i);

        try {
            checkForZero(i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }

        System.out.println("This happens always");
    }

    private static void checkForZero(int number) throws TestException {
        if (number == 0) {
            throw new TestException("NUMBER IS ZERO!");
        }
    }
}
