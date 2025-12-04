package Task_20;

import java.util.Scanner;

public class ElectricMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of units consumed:");
        if (sc.hasNextDouble()) {
            double unitsConsumed = sc.nextDouble();
            ElectricCityBill ec = new ElectricCityBill(unitsConsumed);
            ec.RateStructure();
        }else {
            System.out.println("enter the valid input");
        }
    }
}
