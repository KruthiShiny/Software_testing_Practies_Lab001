package TaskPackages;
import java.util.Scanner;
public class TaskMaxOfTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the two numbers");
        if(sc.hasNextInt()){
            int x= sc.nextInt();
            int y= sc.nextInt();
            int z= x>y?x:y ;
            System.out.println(z+"is the maximum nunber of of the given numbers");
        }
        else
        {
            System.out.println("provide the valid input");
        }

    }
}
