package mckinley;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DayFromDate {
    public static void main(String[] args) {
        String[] days={"SAT","SUN","MON","TUE","WED","THU","FRI"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date : ");
        int d =sc.nextInt();
        System.out.println("Enter the month : ");
        int m =sc.nextInt();
        System.out.println("Enter the year : ");
        int year =sc.nextInt();
        if(m<3) {
            m += 12;
            year-=1;
        }
        int j = year/100;
        int k=year%100;

        int n=(d+13*(m+1)/5 +k+k/4+j/4+5*j)%7;
        System.out.println(days[n]);


    }

}
