import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        // System.out.println(subsequence("", "abc"));
        int[] arr = { 1, 2, 3 };
        int[] arr1 = { 1, 2, 2 };
        // System.out.println(subsequence_Iter(arr));
        System.out.println(subsequence_Iter_Duplicate(arr1));
    }

    static ArrayList<String> subsequence(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

//        ArrayList<String> ans= new ArrayList<>();
//        char ch = up.charAt(0);
//        ans.addAll(subsequence(p + ch, up.substring(1)));
//        ans.addAll( subsequence(p, up.substring(1)));


        char ch = up.charAt(0);
        ArrayList<String> left = subsequence(p + ch, up.substring(1));
        ArrayList<String> right = subsequence(p, up.substring(1));

        left.addAll(right);
        return left;

    }

    static List<List<Integer>> subsequence_Iter(int nums[]) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int n : nums) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(n);
                outer.add(inner);
            }
        }
        return outer;

    }

    static List<List<Integer>> subsequence_Iter_Duplicate(int nums[]) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s = 0;
        int e = 0;
        for (int i = 0; i < nums.length; i++) {
            s = 0;
            if (i > 0 && nums[i] == nums[i - 1])
                s = e + 1;
            e = outer.size() - 1;
            int size = outer.size();

            for (int j = s; j < size; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
        return outer;

    }
}
