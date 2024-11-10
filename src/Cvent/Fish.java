package Cvent;

import  java.util.Stack;

public class Fish {
    public static void main(String[] args) {
        int[] A={4,3,2,1,5};
        int[] B={0,1,0,0,0};
        System.out.println(fishLeft(A,B));
    }
    public static int fishLeft(int[] A, int[] B){
        int count=A.length;
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ;i<A.length ;i++){
            if(B[i]==1)s.push(A[i]);
            else{
                while(!s.isEmpty()){
                    if(A[i]<s.peek()) {
                        count--;
                        break;
                    }
                    else{
                        count--;
                        s.pop();
                    }
                }
            }
        }



        return count;
    }
}
