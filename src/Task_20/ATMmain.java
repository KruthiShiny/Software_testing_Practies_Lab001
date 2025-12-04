package Task_20;

import java.util.Scanner;

public class ATMmain {
    public static void main(String[] args) {
        ATMbalence atm= new ATMbalence(10000.00);
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the amount to be withdrawal: ");
        if(sc.hasNextInt()){
            int withdrawal= sc.nextInt();
            atm.with_drawal(withdrawal);
        }else {
            System.out.println("enter the valid input");
        }
    }
}
