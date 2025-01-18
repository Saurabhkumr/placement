package daa;

import java.util.Random;

public class RandomizedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = Search(arr, target);
        System.out.println(result);


    }
    public static int Search(int[] arr,int target){
        int l = 0;
        int r = arr.length-1;
        Random rand = new Random();
        while(l<=r){
            int mid = rand.nextInt(r-l+1)+l;
            if(arr[mid]==target)return mid;
            else if(arr[mid]>target)r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
}
