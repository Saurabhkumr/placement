package codevita;
import java.util.*;

public class ArrangeMap {
    static class Point {
        int x, y, dist;
        Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); // Consume the newline

        char[][] grid = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        // Find the shortest path using BFS
        System.out.println(findShortestPath(grid, N));
    }

    private static int findShortestPath(char[][] grid, int N) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        boolean[][] visited = new boolean[N][N];
        Queue<Point> queue = new LinkedList<>();

        // Find the starting point 'S'
        int startX = 0, startY = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 'S') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }

        queue.add(new Point(startX, startY, 0));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            if (grid[point.x][point.y] == 'D') {
                return point.dist;
            }

            for (int i = 0; i < 4; i++) {
                int newX = point.x + dx[i];
                int newY = point.y + dy[i];

                if (isValid(newX, newY, N, grid, visited)) {
                    visited[newX][newY] = true;
                    queue.add(new Point(newX, newY, point.dist + 1));
                }
            }
        }

        return -1; // If no path found
    }

    private static boolean isValid(int x, int y, int N, char[][] grid, boolean[][] visited) {
        return x >= 0 && x < N && y >= 0 && y < N && !visited[x][y] && (grid[x][y] == 'T' || grid[x][y] == 'D' || grid[x][y] == 'S');
    }
}
