package remotestate;

import java.util.HashSet;

public class Longest_SubString_NonRepeating {
    public static void main(String[] args) {
        String str = "abcdbaef";
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int size = str.length();
        int max = 0;

        while (r < size) {
            if (!set.contains(str.charAt(r))) {
                set.add(str.charAt(r));
                max = Math.max(max, r-l+1);
            } else {
                while (set.contains(str.charAt(r))) {
                    set.remove(str.charAt(l));
                    l++;
                }
                set.add(str.charAt(r));
            }
            r++;
        }


        System.out.println(max);
    }
}
