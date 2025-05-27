package PracticePrograms;

import java.util.Scanner;

public class FactorialPractice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = 1;
        int fact = 1;
        System.out.println("enter the factorial number: ");
        if(sc.hasNextInt()) {
            n = sc.nextInt();
        }
        else {
            System.out.println("please enter the number only it doesnot take any alphabet or special charecters");
        }
        if(n==0){
            System.out.println("the factorial of 0 is always 1");
        }
        else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;//1*1=1
                //1*2=2
                //2*3=6
            }
            System.out.println("the factorial of the given number is: " + fact);
        }


    }
}
