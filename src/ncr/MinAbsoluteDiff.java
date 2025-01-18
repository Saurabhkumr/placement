package ncr;

import java.util.ArrayList;
import java.util.List;

public class MinAbsoluteDiff {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        solution(list);
    }

    public static void solution(List<Integer> numbers){
        numbers.sort((a,b)->a-b);

        int mindiff = Integer.MAX_VALUE;
        for(int i = 1 ;i<numbers.size();i++){
            int currdiff = Math.abs(numbers.get(i)-numbers.get(i-1));
            mindiff = Math.min(mindiff,currdiff);
        }
        for(int i = 1 ;i<numbers.size();i++){
            int currdiff = Math.abs(numbers.get(i)-numbers.get(i-1));
            if(currdiff==mindiff){
                System.out.println(numbers.get(i-1)+" "+numbers.get(i));
            }
        }


    }
}
