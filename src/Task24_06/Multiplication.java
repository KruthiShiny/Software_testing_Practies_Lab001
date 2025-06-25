package Task24_06;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        if(sc.hasNextInt()){
            int num= sc.nextInt();
            for(int i=1;i<=10;i++){
                int mul= num*i;
                System.out.println(num+"*"+i+"="+mul);
            }
        }
    }
}
