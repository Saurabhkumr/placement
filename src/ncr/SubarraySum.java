package ncr;

public class SubarraySum {
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        int current =arr[0];
        int global =arr[0];
        int n = arr.length;
        for(int i=1; i<n;i++){
            global=Math.max(arr[i],arr[i]+global);
            current=Math.max(global,current);

        }
        return current;
    }
}
