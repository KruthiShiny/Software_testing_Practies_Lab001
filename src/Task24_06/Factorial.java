package Task24_06;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        if(sc.hasNextInt()){
            int num= sc.nextInt();
            int fact=1;
            for(int i=num;i>=1;i--){
                 fact= i*fact;//1*3=3

            }
            System.out.println(num+"! ="+fact);
        }
    }
}
