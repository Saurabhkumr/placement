package ncr;

import java.util.Arrays;
import java.util.HashMap;


class MinSwaps {
    // Driver code
    public static void main(String[] args)
    {
        int[] a = { 1, 5, 4, 3, 2 };
        System.out.println(swaps(a));
    }
    static int swaps(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i],i);
        }
        for (int i = 0; i < arr.length; i++) {
            while (map.get(arr[i]) != i) {
                int correctIndex = map.get(arr[i]);
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;

                count++;
            }
        }
        return count;

    }
}
