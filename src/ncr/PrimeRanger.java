package ncr;

public class PrimeRanger {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{31,32}));
    }
    public static int solution(int[] arr){
        int count=0;
        for(int i = arr[0] ; i<=arr[1] ;i++){
           int count2=0;
           int count3=0;
           int count5=0;
           int count7=0;
            int n =i;
            while(n>0){
                int m =n%10;
                if(m==2)count2++;
                else if(m==3)count3++;
                else if(m==5) count5++;
                else if(m==7) count7++;
                n=n/10;
            }
                if(count2>=count3 && count3>=count5 && count5>=count7)count++;
        }
        return count;
    }
}
