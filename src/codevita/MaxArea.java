package codevita;
import java.util.*;

public class MaxArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<int[]> lines = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            lines.add(new int[]{x1, y1, x2, y2});
        }

        int verticesCount = sc.nextInt();
        List<int[]> polygon = new ArrayList<>();

        for (int i = 0; i < verticesCount; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            polygon.add(new int[]{x, y});
        }

        int maxArea = computeArea(polygon);
        System.out.println(maxArea);
    }

    private static int computeArea(List<int[]> polygon) {
        int n = polygon.size();
        int area = 0;

        for (int i = 0; i < n; i++) {
            int[] p1 = polygon.get(i);
            int[] p2 = polygon.get((i + 1) % n);
            area += p1[0] * p2[1] - p1[1] * p2[0];
        }

        return Math.abs(area) / 2;
    }
}
