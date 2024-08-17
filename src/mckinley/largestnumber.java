package mckinley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class largestnumber {
    public static void main(String[] args) {
        String n = "8165431";
        int k =2;
        System.out.println(solution(n,k));

    }

    public  static int solution(String n , int k){
        Stack<String> stack = new Stack<>();
        String[] arr = n.split("");
        int count =0;
        for(String s : arr){
            while(!stack.isEmpty() && Integer.parseInt(stack.peek())<Integer.parseInt(s) && count<k ){
                stack.pop();
                count++;
            }
            stack.push(s);
        }
        while(count<k){
            stack.pop();
            count++;
        }

        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }

        return Integer.parseInt(ans.reverse().toString());

    }



}
