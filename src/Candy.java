public class Candy {
    public static void main(String[] args) {
        int[] A = {25, 10, 5};
        System.out.println(FreeCandy(3,8,A));
    }
    public static  int FreeCandy(int N, int K, int[] A){
            int count =0;
            for(int n : A){
                if(n>=10)count+=n/10;
                if(n>K)count+=1;
            }
            return count;
    }

}
