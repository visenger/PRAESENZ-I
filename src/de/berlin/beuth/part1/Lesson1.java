package de.berlin.beuth.part1;

/**
 * Copyright © 2016, Oracle and/or its affiliates. All rights reserved.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * All exercises should be completed using Lambda expressions. There is no need to use an
 * explicit loop in any of the code. Use method references rather than full
 * lambda expressions wherever possible.
 */
public class Lesson1 {

    private static final String WORD_REGEXP = "[- .:,]+";

    public void runExercises() throws IOException {
        System.out.println("JDK 8 Lambdas and Streams Lesson 1");
        System.out.println("Running exercise 1 solution...");
        exercise1();
        System.out.println("Running exercise 2 solution...");
        exercise2();
        System.out.println("Running exercise 3 solution...");
        exercise3();
        System.out.println("Running exercise 4 solution...");
        exercise4();
        System.out.println("Running exercise 5 solution...");
        exercise5();
        System.out.println("Running exercise 6 solution...");
        exercise6();
        System.out.println("Running exercise 7 solution...");
        exercise7();
        System.out.println("Running exercise 8 solution...");
        exercise8();
    }


    /**
     * Exercise 1
     * <p>
     * Create a string that consists of the first letter of each word in the list
     * of Strings provided.
     */
    private void exercise1() {
        List<String> list = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    /* YOUR CODE HERE */
    }

    /**
     * Exercise 2
     * <p>
     * Remove the words that have odd lengths from the list.
     */
    private void exercise2() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

    /* YOUR CODE HERE */
    }

    /**
     * Exercise 3
     * <p>
     * Replace every word in the list with its upper case equivalent.
     */
    private void exercise3() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

    /* YOUR CODE HERE */
    }

    /**
     * Exercise 4
     * <p>
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order.
     */
    private void exercise4() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

    /* YOUR CODE HERE */
    }

    /**
     * Exercise 5
     * <p>
     * Create a new thread that prints the numbers from the list.
     */
    private void exercise5() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    /* YOUR CODE HERE */
    }

    /**
     * Exercise 6
     * <p>
     * Create a new list with all the strings from original list converted to
     * lower case and print them out.
     */
    private void exercise6() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

    /* YOUR CODE HERE */
    }

    /**
     * * Exercise 7
     * <p>
     * Count the number of lines in the file using the BufferedReader provided
     */
    private void exercise7() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("src/resources/sonnet.txt"), StandardCharsets.UTF_8)) {
      /* YOUR CODE HERE */
        }
    }

    /**
     * * Exercise 8
     * <p>
     * Using the BufferedReader to access the file, create a list of words with
     * no duplicates contained in the file.  Print the words.
     * <p>
     * HINT: A regular expression, WORD_REGEXP, is already defined for your use.
     */
    private void exercise8() throws IOException {

        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("src/resources/sonnet.txt"), StandardCharsets.UTF_8)) {
      /* YOUR CODE HERE */
        }
    }

    /**
     * Main entry point for application
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Lesson1 lesson = new Lesson1();
        lesson.runExercises();
    }
}
