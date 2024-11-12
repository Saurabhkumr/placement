package remotestate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        String[] wordList = {"listen", "enlist", "google", "inlets", "banana"};
        String word = "silent";
        System.out.println(findAnagram(word,wordList).toString());

    }
    public static ArrayList<String> findAnagram(String s , String[] words){
        ArrayList<String> arr = new ArrayList<>();
        HashMap<Character,Integer> target = getHashMap(s);
        for(String str: words){
            if(getHashMap(str).equals(target)){
                arr.add(str);
            }
        }
        return arr;

    }
    public static HashMap<Character,Integer> getHashMap(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map;
    }
}
