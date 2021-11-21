package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* Assignment Operators  */

        int x = 100;
        int y = 20;

        x = x + y;
        x += y;
        System.out.println(x);
        x -= y;
        System.out.println(x);
        x *= y;
        System.out.println(x);
        x /= y;
        System.out.println(x);
        x %= y;
        System.out.println(x);

        // Incrementing
        x = x + 1;
        x += 1;
        x++;
        System.out.println(x);

        // Decrementing
        x--;
        System.out.println(x);
    }
}
