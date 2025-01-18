//package tcs;
//
//import java.util.Arrays;
//
//public class GoodString {
//    public static void main(String[] args) {
//    String good = "aBcD!@#$%^";
//    String name = "Ramesh";
//    System.out.println(distance(good,name));
//
//    }
//    public static int distance(String good , String name){
//        int td=0;
//        char[] arr = good.toCharArray();
//        Arrays.sort(arr);
//        for(char ch : name.toCharArray()){
//
//        }
//        for(int i =0 ; i<name.length() ;i++){
//            int min=Integer.MAX_VALUE;
//            int count=1;
//            char f='0';
//            char s='0';
//            for(int j=0; j<good.length() ;j++){
//                int first = name.charAt(i);
//                int second = good.charAt(j);
//                int result = Math.abs(first-second);
//                if(result==min){
//                    count++;
//                    s = (char)second;
//                }
//                else if(result<min){
//                    min=result;
//                    count=1;
//                    f = (char)second;
//                }
//            }
//            if(count>1){
//                if(Math.abs((int)arr[k-1]-(int)f)>Math.abs((int)arr[k-1]-(int)s)){
//                    arr[k]=s;
//                    min=Math.abs((int)arr[k-1]-(int)s);
//                }
//                else{
//                    arr[k]=f;
//                    min=Math.abs((int)arr[k-1]-(int)f);
//
//                }
//            }
//            else if(min==0)arr[k]=arr[k-1];
//            td+=min;
//        }
//        return td;
//
//    }
//}
