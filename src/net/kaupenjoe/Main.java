package net.kaupenjoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Outputting with println and Inputting with Scanner */

        System.out.println("Hello Students!");

        int x = 10;
        System.out.println(x);

        System.out.println("Outputting some Value: " + x);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your Username");
        String input = scanner.next();

        System.out.println("Your Username is: " + input);
    }
}
