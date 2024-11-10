package tcs;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        System.out.println(countSwap(5,arr));
    }
    public static int countSwap(int n , int[] arr){
        int count=0;
        for(int i = 0 ; i<n-1 ;i++){
            for(int j = 0 ; j<n-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return count;
    }
}
