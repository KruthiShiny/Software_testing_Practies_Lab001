package Task19thJune;

import java.util.Scanner;

public class PositiveNegativeChecker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");

        if(sc.hasNextDouble()) {
            double num = sc.nextDouble();
            if (num < 0) {
                System.out.println("negative");
            } else {
                System.out.println("positive");
            }
        }
        else {
            System.out.println("Please provide the valid number");
        }
    }
}
