package daa;

public class LCS {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(subSequence(s1,s2));

    }
    public static String subSequence(String s1 , String s2){
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=1 ; i<=n ;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        int i = n;
        int j = m;
        StringBuilder str = new StringBuilder();
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                str.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]<dp[i][j-1])j--;
            else i--;
        }
        return str.reverse().toString();
    }
}
