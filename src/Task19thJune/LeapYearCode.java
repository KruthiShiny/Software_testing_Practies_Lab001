package Task19thJune;

import java.util.Scanner;

public class LeapYearCode {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year");
        if(sc.hasNextInt()){
            int year= sc.nextInt();
            if(((year%4==0) && (year%100!=0)) || (year%400==0)){
                System.out.println("leap year");
            }
            else {
                System.out.println("not leap year");
            }
        }else {
            System.out.println("enter the valid year");
        }
    }
}
