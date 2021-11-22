package net.kaupenjoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* ARRAYLIST, MAPS AND SETS (Collections) */

        String[] questions = new String[2];
        questions[0] = "How many States does the USA have?";
        questions[1] = "Capital of UK?";

        List<String> questionList = new ArrayList<>();
        questionList.add("What Language is spoken in Germany?");
        questionList.add("What is the Capital of Canada?");
        questionList.add("In what Hemisphere is Brazil?");

        // LISTS --> Add entries / elements dynamically

        questionList.remove(1);

        System.out.println(questionList.size());
        System.out.println(questionList.get(0));

        // Wrapper Classes we can use instead of the primitive data types
        List<Integer> numbers = new ArrayList<>();
        numbers.add(420);
        numbers.add(42);


        // MAPS
        // Map contains a Key and a Value. Key maps to a certain Value
        // Key-Value Pair
        Map<String, String> countryToCapital = new HashMap<>();
        countryToCapital.put("Germany", "Berlin");
        countryToCapital.put("France", "Paris");
        countryToCapital.put("Italy", "Rome");
        countryToCapital.put("USA", "Washington DC");

        System.out.println(countryToCapital.get("Germany"));

        System.out.println("Contains Key 'Germany'? " + countryToCapital.containsKey("Germany"));
        System.out.println("Contains Value 'London'? " + countryToCapital.containsValue("London"));

        System.out.println(countryToCapital.remove("France"));


        // SETS
        // A Set is a collection that contains no duplicates
        Set<String> usernames = new HashSet<>();
        usernames.add("Kaupenjoe");
        usernames.add("Nanoattack");

        System.out.println(usernames.add("FRV"));
        System.out.println(usernames.add("FRV"));


        // ERRORS YOU MIGHT RUN INTO
        // Uncomment for errors

        // IndexOutOfBoundException
        // If you try and pass in an Index that does not exist for a list
        // System.out.println(questionList.get(2));

        // Not an Exception, BUT "null"
        // If you pass in a Key into a Map that does not exist
        // Your return value is going to be null (might lead to other errors down the line!)
        // System.out.println(countryToCapital.get("Malta"));
    }
}
