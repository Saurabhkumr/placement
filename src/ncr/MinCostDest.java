package ncr;

public class MinCostDest {
    static int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int cost[][] = { {0, 15, 80, 90},
                {INF, 0, 40, 50},
                {INF, INF, 0, 70},
                {INF, INF, INF, 0}
        };
        System.out.println("The Minimum cost to reach station is "+minCost(cost));
    }
    static int minCost(int[][] cost){
        int n= cost.length;
        int[] distCost = new int[n];
        distCost[0]=0;
        for(int i=1 ;i<n;i++){
            int j=1;
            int min = distCost[0]+cost[0][i];
            while(j<i){
                int sum = distCost[j]+cost[j][i];
                min=Math.min(sum,min);
                j++;
            }
            distCost[i]=min;
        }


        return distCost[n-1];
    }
}
