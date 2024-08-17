package mckinley;

import java.util.HashMap;
import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter participant : ");
        String str1 = sc.nextLine();
        String[] input = str1.split(" ");
        System.out.println("Enter participant finish race : ");
        String str2 = sc.nextLine();
        String[] output = str2.split(" ");
        HashMap<String , Integer> map = new HashMap<>();
        for(String s : output)
        {
            map.put(s,1);
        }
        for(String s : input){
            if(!map.containsKey(s)) System.out.println(s);
        }

    }
}
