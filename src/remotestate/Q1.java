package remotestate;

import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 1, 2, 5, 5, 0};
        System.out.println("First non-duplicate number is: " + firstNonDuplicate(arr));
    }
    public static int firstNonDuplicate(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            if(!map.containsKey(n))map.put(n,1);
            else map.put(n,map.get(n)+1);
        }
        for(int n : arr){
            if(map.get(n)==1)return n;
        }
        return -1;
    }
}
