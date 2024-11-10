package celebAi;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Hello World From Java";
        StringBuilder ans = new StringBuilder();
        String[] words=str.split(" ");
        for(int i = 0 ; i< words.length ; i++){
            StringBuilder str2 = new StringBuilder(words[i]);
            str2.reverse();
            ans.append(str2);
            if(i<words.length-1)ans.append(" ");
        }
        System.out.println(ans.toString());
    }
}
