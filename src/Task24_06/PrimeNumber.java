package Task24_06;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        if(sc.hasNextInt()){
            int num= sc.nextInt();
            int count=0;
            if(num<=1){
                System.out.println(num+" is not a prime number");
            }else {
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        count++;

                    }
                }
            }
            if(count==2)
            {
                System.out.println(num+" is a prime number");
            }
            else {
                System.out.println(num+"num is not a prime number");
            }

        }
        else {
            System.out.println("enter the valid number");
        }
    }
}
