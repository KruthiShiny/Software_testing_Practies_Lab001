package TaskPackages;

import java.util.Scanner;

class TaskPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        if(sc.hasNextDouble()){
        double num= sc.nextDouble();
            if(num<0){
                System.out.println("negative");
            } else if (num>=0) {
                System.out.println("positive");

            }else
            {
                System.out.println("enter the number");
            }

        }
        else {
            System.out.println("enter the valid number");
        }

    }
}

