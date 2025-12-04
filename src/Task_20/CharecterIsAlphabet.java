package Task_20;

import java.util.Scanner;

public class CharecterIsAlphabet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the charecter:");
       char ch=sc.next().charAt(0);
        if(((ch>='a') &&(ch<='z'))||((ch>='A') &&(ch<='Z'))){
            System.out.println("its a charecter");

        }
        else {
            System.out.println("not a charecter");
        }


    }
}
