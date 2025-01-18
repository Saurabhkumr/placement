package interview;

import java.util.Arrays;

public class calender {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(5,16,5,2025)));
    }
    static int[] solution(int day , int date , int month , int year){

        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int[] arr = new int[2];
        boolean leapYear=false;

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))leapYear=true;

        int n = date % 7;

        int start = Math.abs(n-day);
        System.out.println(start);
        int monthPrev;

        if(month==1)monthPrev=11;
        else monthPrev = month-2;
        System.out.println(monthPrev);

        int startingDate =daysInMonths[monthPrev]-start+1;
        System.out.println(startingDate);

        int endingDate = 7-daysInMonths[month-1]%7-start;
        System.out.println(endingDate);

        arr[0] = startingDate;
        arr[1] = endingDate;

        return arr;

    }
}
