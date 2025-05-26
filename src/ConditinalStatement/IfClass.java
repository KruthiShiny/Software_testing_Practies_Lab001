package ConditinalStatement;

import java.util.Scanner;

public class IfClass {
    public static void main(String[] args) {
     /*    Scanner sc=new Scanner(System.in);
        System.out.println("enter the age: ");
        int age =sc.nextInt();
        int age = 0 ;
        age = Integer.parseInt(args[0]);

         if(age>18)
       {
         System.out.println("the candidate is allowed to vote");
        }
        else
        {
            System.out.println("the candidate is not allowed to vote");
        }*/


        int a, b, exp = 10;
        a = b = 5;
        exp *= ++a * 10 / b++ + --a;
        System.out.println("exp = " +exp);

    }
    }


