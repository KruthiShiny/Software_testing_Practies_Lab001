package TaskPackages;
import java.util.Scanner;
public class TaskVoteChecker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age");
        if(sc.hasNextInt()){
            int age= sc.nextInt();
            if(age<18){
                System.out.println("Not elegible for vote");
            }
            else if(age>=18){
                System.out.println("elegible for vote");
            }

        }
        else
        {
            System.out.println("provide the valid input");
        }

    }
}
