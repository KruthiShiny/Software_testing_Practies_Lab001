package Task19thJune;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        if(sc.hasNextInt()){
            int num= sc.nextInt();
            if(num%2==0){
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
        }
        else {
            System.out.println("enter the valid number to check even or odd");
        }
    }
}
