package TaskPackages;
import java.util.Scanner;
public class TaskEvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        if(sc.hasNextInt()){
            int number= sc.nextInt();
            if(number%2==0){
                System.out.println("the number is even");
            }
            else
            {
                System.out.println("the number is odd");
            }
        }
        else
        {
            System.out.println("please enter the valid number");
        }

    }
}

