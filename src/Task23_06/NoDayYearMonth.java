package Task23_06;

import java.util.Scanner;

public class NoDayYearMonth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no of days:");
        if(sc.hasNextInt()) {
            int days = sc.nextInt();
            int years= days/365;
            int month_cal= days%365;
            int month= month_cal/30;
            int remaining_days=month_cal%30;
            System.out.println("No of years is:"+years);
            System.out.println("No of months is:"+month);
            System.out.println("No of days is:"+remaining_days);
        }else {
            System.out.println("enter the valid input");
        }
    }
}
