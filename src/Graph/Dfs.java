package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Dfs {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertex : ");
        int vertex = sc.nextInt();
        System.out.println("Enter number of edges : ");
        int edge = sc.nextInt();
        for(int i = 0 ; i<vertex ; i++) adj.add(new ArrayList<>());
        for(int i = 0 ; i<edge ; i++ ) {
            System.out.println("Enter the pair (u v) : ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        System.out.println("Enter the starting node : ");
        int start = sc.nextInt();
        boolean[] visited = new boolean[vertex];
        ArrayList<Integer> ans = new ArrayList<>();
         dfs(adj,ans,visited,0);

        System.out.println(ans);

    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj ,ArrayList<Integer> ans, boolean[] visited , int start){
        visited[start]=true;
        ans.add(start);
        for(int i : adj.get(start)){
            if(!visited[i])dfs(adj,ans,visited,i);
        }
    }
}
