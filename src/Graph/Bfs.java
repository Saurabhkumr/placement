package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertex : ");
        int vertex = sc.nextInt();
        System.out.println("Enter number of edges : ");
        int edge = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i<vertex; i++) adj.add(new ArrayList<>());
        for(int i = 0 ; i<edge ;i++){
            System.out.println("Enter the edge in (u v) format where u is connected to v : ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);

        }
        System.out.println("Starting node : ");
        int start = sc.nextInt();
        ArrayList<Integer> ans = bfs(adj,start);
        System.out.println(ans);
    }

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj , int start){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()];
        visited[start]=true;
        queue.offer(start);
        while (!queue.isEmpty()){
            int v = queue.poll();
            ans.add(v);
            for(int i : adj.get(v)){
                if(!visited[i]) queue.offer(i);
                visited[i]=true;
            }

        }
        return ans;
    }
}
