package ExceptionsPackage;

import java.util.Scanner;

public class ArrayOutBound {
    public static void main(String[] args) {
        String str;
        int len;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string and length of the string:");
        str=sc.next();
        len=sc.nextInt();
        if((str=="")||(len>str.length())){
        try {
            for(int i=0;i<len;i++){
                char print=str.charAt(i);
                System.out.println("the progressed array is:"+print);
            }

        } catch (ArrayIndexOutOfBoundsException |NullPointerException e) {
            System.out.println(e.getMessage()+"ArrayIndexOutOfBoundsException");
        }

    }
        else {
            for(int i=0;i<len;i++){
                char print=str.charAt(i);
                System.out.println("the progressed array is:"+print);
            }
        }

    }
}
