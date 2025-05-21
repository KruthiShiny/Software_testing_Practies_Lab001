package ConditinalStatement;

import java.util.Scanner;

public class ClasifyingTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.println("enter the length of the triangle: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if(y==x){
            if(y==z){
                System.out.println("equilateral Trianle");
                } else {
                System.out.println("isoceles Trianle");
            }
        } else if (y==z) {
            System.out.println("isoceles Trianle");
        } else if (x==z) {
            System.out.println("isoceles Triangle");

        }else
        {
            System.out.println("scalene Triangle");
    }

    }
}