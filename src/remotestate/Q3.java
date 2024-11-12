package remotestate;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(primeRotation(100).toString());
    }
    public static ArrayList<Integer> primeRotation(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=2;i<=n ;i++){
            if(isRotatedPrime(i))ans.add(i);
        }
        return ans;
    }
    public static boolean isRotatedPrime(int n){
        ArrayList<Integer> arr = getAllRotation(n);
        for(Integer i : arr){
            if(!isPrime(i))return false;
        }
        return true;
    }
    public static ArrayList<Integer> getAllRotation(int n){
        ArrayList<Integer> rotation = new ArrayList<>();
        String str = Integer.toString(n);

        for(int i = 0 ; i<str.length();i++){
            String s = str.substring(i)+str.substring(0,i);
            rotation.add(Integer.parseInt(s));
        }
        return rotation;
    }
    public static boolean isPrime(int n){
        if(n<2)return false;
        for(int i=2 ; i<=Math.sqrt(n) ;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
