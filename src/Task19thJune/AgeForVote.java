package Task19thJune;

import java.util.Scanner;

public class AgeForVote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age:");
        if(sc.hasNextInt()){
            int age= sc.nextInt();
            if (age>=18){
                System.out.println("eligible for vote");
            }
            else {
                System.out.println("not eligible for vote");
            }
        }
        else {
            System.out.println("enter the age in numbers donot use any special charecters");
        }
    }
}
