import java.util.ArrayList;

public class letterCombinationofPhone {
    public static void main(String[] args) {
        System.out.println(combination("23"));
    }
    static ArrayList<String> combination(String digit){
        if(digit.isEmpty()){
            return new ArrayList<>();
        }
        String[] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String p="";
         return phone(digit,mapping,p);
    }
    static ArrayList<String> phone(String digit , String[] mapping , String p ){
        if(digit.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        ArrayList<String> ans = new ArrayList<>();
        int n = digit.charAt(0)-'0';
        for (int i = 0 ; i<mapping[n].length();i++){
            char ch = mapping[n].charAt(i);
            ans.addAll(phone(digit.substring(1),mapping,p+ch));
        }

     return  ans;

    }

}
