package Task19thJune;

import java.util.Scanner;

public class scoring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=0;
        System.out.println("enter the marks scored: ");
        if(sc.hasNextInt()){
            score=sc.nextInt();
        }
        else {
            System.out.println("enter the markes in numbers not any special charecters or alphabets");
        }
        if(score>=90 && score<=100)
        {
            System.out.println("A grade");
        } else if (score>=80 && score<=89) {
            System.out.println("B grade");

        } else if (score>=70 && score<=79) {
            System.out.println("C grade");
        }
        else if (score>=60 && score<=69){
            System.out.println("D grade");
        }
        else if (score>=0 && score<=59){
            System.out.println("F grade");
        }
        else{
            System.out.println("Enter the number between 0 to 100 above and negative number are not accepted, that will not exits as a score");
        }

    }
}
