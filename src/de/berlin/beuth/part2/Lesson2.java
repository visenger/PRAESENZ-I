package de.berlin.beuth.part2;

/**
 * Playground for Lesson 2;
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson2 {

    private Trader raoul;
    private Trader mario;
    private Trader alan;
    private Trader brian;

    private List<Transaction> transactions;

    public Lesson2() {
        init();
    }

    private void init() {
        raoul = new Trader("Raoul", "Cambridge");
        mario = new Trader("Mario", "Milan");
        alan = new Trader("Alan", "Cambridge");
        brian = new Trader("Brian", "Cambridge");

        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

    }

    public void runExercises() {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();

        // Well done! :)
    }

    /**
     * todo: 8.Find the transaction with the smallest value.
     */
    private void exercise8() {
         /* YOUR CODE HERE */
    }

    /**
     * todo: 7.What’s the highest value of all the transactions?
     */
    private void exercise7() {
         /* YOUR CODE HERE */
    }

    /**
     * todo: 6.Print all transactions’ values from the traders living in Cambridge.
     */
    private void exercise6() {
         /* YOUR CODE HERE */
    }

    /**
     * todo: 5.Are any traders based in Milan?
     */
    private void exercise5() {
         /* YOUR CODE HERE */
    }

    /**
     * todo: 4. Return a string of all traders’ names sorted alphabetically.
     */
    private void exercise4() {
         /* YOUR CODE HERE */
    }

    /**
     * todo: 3.Find all traders from Cambridge and sort them by name.
     */
    private void exercise3() {
         /* YOUR CODE HERE */
    }

    /**
     * todo: 2. What are all the unique cities where the traders work?
     */
    private void exercise2() {
         /* YOUR CODE HERE */
    }

    /**
     * todo: 1. Find all transactions in the year 2011 and sort them by value (small to high).
     */
    private void exercise1() {
        List<Transaction> trans1 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(transaction -> transaction.getValue()))
                .collect(Collectors.toList());
        trans1.forEach(System.out::println);
    }

    public static void main(String[] args) {

        Lesson2 lesson2 = new Lesson2();
        lesson2.runExercises();
    }
}
