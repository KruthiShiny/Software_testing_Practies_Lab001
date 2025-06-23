package Task23_06;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age:");
        if(sc.hasNextInt()){
            int age= sc.nextInt();
            if((age>0) && (age<12)){
                System.out.println("Child");
            } else if ((age>13) && (age<19)) {
                System.out.println("Teenager");
            }else if ((age>20) && (age<64)) {
                System.out.println("adult");
            }else if (age>65) {
                System.out.println("Senior citizen");
            }
        }else {
            System.out.println("enter the valid details");
        }
    }
}
