package ncr;

public class Equibilium {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3};

        System.out.println(findEquilibrium(arr));
    }

    public static int findEquilibrium(int[] arr){

        int n = arr.length;
        int[] prefix= new int[n];
        int[] suffix= new int[n];

        prefix[0]=arr[0];
        suffix[n-1]=arr[n-1];

        for (int i = 1; i < n; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i = n-2; i >=0 ; i--) {
            suffix[i]=suffix[i+1]+arr[i];
        }

        for (int i=0 ;i<n ;i++){
            if(prefix[i]==suffix[i])return i;
        }
        return -1;


    }
}
