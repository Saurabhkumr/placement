public class GoodString {
    public static void main(String[] args) {
        int count = 0;
        solution(count , 3 , 3 , 1 , 1 , new StringBuilder());
        System.out.println("count : "+ count);

    }
    static void solution(int count , int low , int high , int zero , int one , StringBuilder str)  {
        if(str.length()>high)return;
        if(low <= str.length() && str.length() <= high)count++;
        for(int i = 0 ; i<zero ;i++)str.append("0");
        solution(count,low,high,zero,one,str);
        for(int i = 0 ; i<one ;i++)str.append("1");
        solution(count,low,high,zero,one,str);

    }
}
