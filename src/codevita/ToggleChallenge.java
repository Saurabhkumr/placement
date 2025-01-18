package codevita;

import java.util.*;

public class ToggleChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] digitPatterns = new String[3];
        for (int i = 0; i < 3; i++) {
            digitPatterns[i] = scanner.nextLine();
        }

        String[] faultyPatterns = new String[3];
        for (int i = 0; i < 3; i++) {
            faultyPatterns[i] = scanner.nextLine();
        }

        Map<String, Integer> digitMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            StringBuilder pattern = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                pattern.append(digitPatterns[j], i * 3, (i + 1) * 3);
            }
            digitMap.put(pattern.toString(), i);
        }

        int numDigits = faultyPatterns[0].length() / 3;
        String[] faultyDigits = new String[numDigits];
        for (int i = 0; i < numDigits; i++) {
            StringBuilder segment = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                segment.append(faultyPatterns[j], i * 3, (i + 1) * 3);
            }
            faultyDigits[i] = segment.toString();
        }

        List<List<Integer>> allPossibleNumbers = new ArrayList<>();

        for (String faultyDigit : faultyDigits) {
            List<Integer> possibleNumbersForDigit = new ArrayList<>();
            for (String validPattern : digitMap.keySet()) {
                int diff = countDifferences(faultyDigit, validPattern);
                if (diff == 0) {
                    possibleNumbersForDigit.add(digitMap.get(validPattern));
                } else if (diff == 1) {
                    possibleNumbersForDigit.add(digitMap.get(validPattern));
                }
            }
            if (possibleNumbersForDigit.isEmpty()) {
                System.out.println("Invalid");
                return;
            }
            allPossibleNumbers.add(possibleNumbersForDigit);
        }

        List<Integer> resultNumbers = new ArrayList<>();
        generateAllCombinations(allPossibleNumbers, resultNumbers, 0, 0);

        long sum = resultNumbers.stream().mapToLong(Integer::longValue).sum();
        System.out.println(sum);
    }

    private static int countDifferences(String pattern1, String pattern2) {
        int differences = 0;
        for (int i = 0; i < pattern1.length(); i++) {
            if (pattern1.charAt(i) != pattern2.charAt(i)) {
                differences++;
            }
        }
        return differences;
    }

    private static void generateAllCombinations(List<List<Integer>> allPossibleNumbers, List<Integer> resultNumbers, int index, int currentNumber) {
        if (index == allPossibleNumbers.size()) {
            resultNumbers.add(currentNumber);
            return;
        }

        for (int num : allPossibleNumbers.get(index)) {
            generateAllCombinations(allPossibleNumbers, resultNumbers, index + 1, currentNumber * 10 + num);
        }
    }
}
