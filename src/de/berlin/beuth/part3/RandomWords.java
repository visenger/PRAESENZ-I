package de.berlin.beuth.part3;

/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Based on https://apexapps.oracle.com/pls/apex/f?p=44785:145:2808890149081::NO:RP,145:P145_EVENT_ID,P145_PREV_PAGE:5067,2
 * <p>
 * Class to generate a list of random words.
 *
 * @author Simon Ritter (@speakjava)
 */
public class RandomWords {
    private final List<String> sourceWords;
    private static final String WORD_REGEXP = "[- .:,]+";

    /**
     * Constructs an instance of <code>{@link RandomWords}</code> object.
     *
     * @throws IOException If the source words file cannot be read
     */
    public RandomWords() throws IOException {
        String pathToWords = "src/resources/words";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(pathToWords))) {
             /* YOUR CODE HERE */
            sourceWords = Collections.emptyList();

            System.out.println("Loaded " + sourceWords.size() + " words");
        }
    }

    /**
     * Create a list of a given size containing random words
     *
     * @param listSize The size of the list to create
     * @return The created list
     */
    public List<String> select(int listSize) {
        Random rand = new Random();
         /* YOUR CODE HERE */
        List<String> wordList = null;
        return wordList;
    }

    /**
     * Return the list of all source words, which cannot be modified
     *
     * @return The unmodifiable list of all source words
     */
    public List<String> allWords() {
        return Collections.unmodifiableList(sourceWords);
    }
}