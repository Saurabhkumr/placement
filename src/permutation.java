import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        // letterPermutation("", "abc");
        // System.out.println(letterPermutation("", "abc"));
        int[] arr = { 1, 2, 3 };
        System.out.println(permute(arr));
    }

    static ArrayList<String> letterPermutation(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();
        int pos = p.length() + 1;
        for (int i = 0; i < pos; i++) {
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            char ch = up.charAt(0);
            list.addAll(letterPermutation(f + ch + l, up.substring(1)));
        }
        return list; 

    }

    static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();

        backtrack(outer, inner, nums);
        return outer;
    }

    static void backtrack(List<List<Integer>> inner, ArrayList<Integer> outer, int[] nums) {

        if (outer.size() == nums.length) {
            inner.add(new ArrayList<>(outer));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (outer.contains(nums[i]))
                continue;
            outer.add(nums[i]);
            backtrack(inner, outer, nums);
            outer.remove(outer.size() - 1);

        }
    }

}
