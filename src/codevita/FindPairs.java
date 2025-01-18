package codevita;
import java.util.*;

public class FindPairs {

    // Normalize the shape by translating and sorting vertices
    private static List<int[]> normalizeShape(List<int[]> vertices) {
        // Find the minimum x and y coordinates
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        for (int[] vertex : vertices) {
            minX = Math.min(minX, vertex[0]);
            minY = Math.min(minY, vertex[1]);
        }

        // Translate vertices to the origin
        List<int[]> normalized = new ArrayList<>();
        for (int[] vertex : vertices) {
            normalized.add(new int[]{vertex[0] - minX, vertex[1] - minY});
        }

        // Sort the vertices to create a canonical representation
        normalized.sort(Comparator.comparingInt(a -> a[0] * 100 + a[1])); // Sort by x, then by y

        return normalized;
    }

    // Generate all rotations of the shape
    private static List<List<int[]>> generateRotations(List<int[]> shape) {
        List<List<int[]>> rotations = new ArrayList<>();
        int K = shape.size();

        for (int i = 0; i < K; i++) {
            List<int[]> rotation = new ArrayList<>();
            for (int j = 0; j < K; j++) {
                int[] vertex = shape.get((i + j) % K);
                rotation.add(vertex);
            }
            rotations.add(normalizeShape(rotation));
        }

        return rotations;
    }

    // Find matching earrings
    private static List<Integer> findMatchingEarrings(List<List<int[]>> earrings) {
        Map<String, List<Integer>> normalizedShapes = new HashMap<>();

        for (int index = 0; index < earrings.size(); index++) {
            List<int[]> shape = earrings.get(index);
            List<List<int[]>> rotations = generateRotations(shape);

            // Create a unique key for each rotation
            for (List<int[]> rotation : rotations) {
                StringBuilder keyBuilder = new StringBuilder();
                for (int[] vertex : rotation) {
                    keyBuilder.append(vertex[0]).append(",").append(vertex[1]).append(";");
                }
                String key = keyBuilder.toString();

                // Store the index of the earring (1-based)
                normalizedShapes.putIfAbsent(key, new ArrayList<>());
                normalizedShapes.get(key).add(index + 1);
            }
        }

        // Find the matching pair
        for (List<Integer> indices : normalizedShapes.values()) {
            if (indices.size() == 2) {
                return indices; // Return the matching pair
            }
        }

        return Collections.emptyList(); // No match found
    }

    public static void main(String[] args) {
        // Hardcoded input
        int N = 4; // Number of earrings
        List<List<int[]>> earrings = new ArrayList<>();

        // Earring 1
        earrings.add(Arrays.asList(new int[]{0, 0}, new int[]{2, 0}, new int[]{2, 1}, new int[]{0, 1}));
        // Earring 2
        earrings.add(Arrays.asList(new int[]{0, 0}, new int[]{1, 1}, new int[]{0, 1}));
        // Earring 3
        earrings.add(Arrays.asList(new int[]{0, 0}, new int[]{1, 0}, new int[]{1, 2}, new int[]{0, 2}));
        // Earring 4
        earrings.add(Arrays.asList(new int[]{0, 0}, new int[]{1, 0}, new int[]{1, 1}, new int[]{0, 1}));

        // Find matching earrings
        List<Integer> matchingIndices = findMatchingEarrings(earrings);

        // Print the result
        if (!matchingIndices.isEmpty()) {
            Collections.sort(matchingIndices);
            for (int index : matchingIndices) {
                System.out.print(index + " ");
            }
        } else {
            System.out.println("No matching earrings found.");
        }
    }
}