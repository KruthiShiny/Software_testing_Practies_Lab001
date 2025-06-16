package FunctionPractice;

import java.util.Scanner;

public class CalculatorProgram {
    static void add(int a,int b ){
        int sum =a+b;
        System.out.println(sum);
    }
    static void sub(int a,int b){
        int diff=a-b;
        System.out.println(diff);
    }
    static void mul(int a,int b){
        int multi=a*b;
        System.out.println(multi);
    }
    static void div(int a, int b) throws ArithmeticException
    {
        if(b==0){
            throw new ArithmeticException("cannot divide by 0");
        }
        else {
            double divide=(double) a/(double)b;
            System.out.println(divide);
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0, b = 0;
        System.out.println("enter the number :");
            if(sc.hasNextInt()){
                 a= sc.nextInt();
                 b= sc.nextInt();
                System.out.println("yes it allows");
            }else {
                System.out.println("enter the number not any special charecter");
            }
            add(a,b);
            sub(a,b);
            mul(a,b);
            div(a,b);
        }


}
