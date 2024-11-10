package daa;
import java.util.Arrays;

public class FiniteAutomata {

    // Number of possible characters in the input alphabet
    static final int NO_OF_CHARS = 256;

    // Function to build the transition table for the given pattern
    static void buildTransitionTable(String pattern, int[][] transitionTable) {
        int M = pattern.length();
        int lps = 0; // Length of the previous longest prefix suffix

        // Initialize all entries in transition table to 0
        for (int i = 0; i < M; i++) {
            Arrays.fill(transitionTable[i], 0);
        }

        // Set transitions for all characters in pattern
        for (int i = 0; i < M; i++) {
            for (int x = 0; x < NO_OF_CHARS; x++) {
                transitionTable[i][x] = transitionTable[lps][x];
            }
            transitionTable[i][pattern.charAt(i)] = i + 1;

            if (i < M - 1) {
                lps = transitionTable[lps][pattern.charAt(i)];
            }
        }
    }

    // Function to search the pattern in the given text using finite automata
    static void searchPattern(String text, String pattern) {
        int M = pattern.length();
        int N = text.length();

        // Create transition table
        int[][] transitionTable = new int[M + 1][NO_OF_CHARS];
        buildTransitionTable(pattern, transitionTable);

        // Print the transition table
        printTransitionTable(pattern, transitionTable);

        // Initialize state to 0
        int state = 0;

        // Process the text
        for (int i = 0; i < N; i++) {
            state = transitionTable[state][text.charAt(i)];

            // If final state is reached, pattern is found
            if (state == M) {
                System.out.println("Pattern found at index " + (i - M + 1));
            }
        }
    }

    // Function to print the transition table
    static void printTransitionTable(String pattern, int[][] transitionTable) {
        int M = pattern.length();

        // Get the distinct characters from the pattern
        StringBuilder distinctChars = new StringBuilder();
        for (char c : pattern.toCharArray()) {
            if (distinctChars.indexOf(String.valueOf(c)) == -1) {
                distinctChars.append(c); // Add distinct characters only
            }
        }

        // Print the transition table header
        System.out.println("\nTransition Table:");
        System.out.printf("%10s", "State");
        for (int i = 0; i < distinctChars.length(); i++) {
            System.out.printf("%10s", distinctChars.charAt(i));  // Print only relevant characters
        }
        System.out.println();

        // Print the transition table rows
        for (int i = 0; i <= M; i++) {
            System.out.printf("%10d", i);
            for (int j = 0; j < distinctChars.length(); j++) {
                System.out.printf("%10d", transitionTable[i][distinctChars.charAt(j)]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";

        searchPattern(text, pattern);
    }
}
