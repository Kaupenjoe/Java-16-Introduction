package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* STRINGS AND STRING-METHODS */

        String sentence = "It's a wonderful Java Introduction!";
        System.out.println(sentence);
        System.out.println("Length is: " + sentence.length());

        // Upper and Lower Case
        System.out.println("SHOUTING: " + sentence.toUpperCase());
        System.out.println("whispering: " + sentence.toLowerCase());
        System.out.println(sentence);

        // indexOf
        System.out.println("The word 'Java' is found at position: " + sentence.indexOf("Java"));

        // Replace
        System.out.println(sentence.replace("Java", "C#"));

        System.out.println(sentence.startsWith("I"));
        System.out.println(sentence.endsWith("A"));

        String s = "";
        boolean empty = s.isEmpty();
        System.out.println(empty);

        // contains
        System.out.println(sentence.contains("Java"));

        // charAt
        System.out.println(sentence.charAt(17));

        // substring
        System.out.println(sentence.substring(17));
    }
}
