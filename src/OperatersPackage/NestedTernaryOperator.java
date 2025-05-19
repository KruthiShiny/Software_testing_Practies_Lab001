package OperatersPackage;

import java.util.Scanner;

public class NestedTernaryOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age: ");
        int age= sc.nextInt();
        String result= age>=18 ? ((age>=60)? "senior" : "adult") :"minor";
        System.out.println(result);
    }
}
