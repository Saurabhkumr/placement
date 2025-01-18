package ncr;
import java.util.*;
public class Encryption {

        public static void main(String[] args) {
            // solution("AZ BA P");
            System.out.println(solution("AZ BA P"));

        }

        static int solution(String str){
            String[] arr = str.split(" ");
            String[] arr2 = new String[arr.length];
            int j=0;
            for(String s : arr){
                int result=0;
                for(int i = 0 ; i<s.length() ; i++){
                    char ch = s.charAt(i);
                    int n = ch-'A'+1;
                    result = result*26+n;
                }
                arr2[j]=Integer.toString(result);
                j++;
            }

            Arrays.sort(arr2,(a,b)->(b+a).compareTo(a+b));
            String ans ="";
            for(String n : arr2){
                ans+=n;
            }
            return Integer.parseInt(ans);

        }



}
