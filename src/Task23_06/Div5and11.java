package Task23_06;

import java.util.Scanner;

public class Div5and11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        if(sc.hasNextInt()){
            int num= sc.nextInt();
            if((num%5==0)&&(num%11==0)){
                System.out.println("the number is divisible by 5 and 11");
            }
            else if(num%5==0){
                System.out.println("num is divisible by 5 ");
            } else if (num%11==0) {
                System.out.println("num is divisible by 11 ");
            }
            else {
                System.out.println("num is not divisible by both 5 or 11");
            }
        }else {
            System.out.println("enter the valid number");
        }
    }
}
