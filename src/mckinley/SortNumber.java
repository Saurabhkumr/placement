package mckinley;

import java.util.ArrayList;
import java.util.Comparator;

public class SortNumber {
    public static void main(String[] args) {
        int n =634987;
        ArrayList<Integer> num = new ArrayList<>();
        while(n!=0){
            num.add(n%10);
            n /=10;
        }
        num.sort(Comparator.reverseOrder());
        StringBuilder str = new StringBuilder();
        for (Integer integer : num) {
            str.append(integer);
        }
        System.out.println(Integer.parseInt(str.toString()));
    }
}
