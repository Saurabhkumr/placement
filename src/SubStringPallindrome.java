import java.util.ArrayList;

public class SubStringPallindrome {

    public static void main(String[] args) {
        String str="abcbc";
        System.out.println(countSubstrings(str));

    }
        public static int countSubstrings(String s) {
            int count =0;
            for(int i = 0 ; i<s.length() ;i++){
                for (int j = i; j < s.length(); j++) {
                    if(pallindrome(s.substring(i,j+1)))count++;
                }
            }
            return count;
        }



        public static  boolean pallindrome(String str){
            int i = 0;
            int j = str.length()-1;
            while(i<j){
                if(str.charAt(i)==str.charAt(j)){
                    i++;
                    j--;
                }
            }
            return i==j;
        }

}
