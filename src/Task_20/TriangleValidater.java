package Task_20;

import java.util.Scanner;

public class TriangleValidater {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the sides of the triangle:");
        if(sc.hasNextInt()){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if((x!=y)&&(x!=z)&&(y!=z)){
                System.out.println("Scalene");

            }
            else if(((y==x)&&(y!=z))||((y!=x)&&(y==z))||((x!=y)&&(y!=z))){
                System.out.println("Isocelease Triangle");
            }
            else{
                System.out.println("equlateral triangle");
            }
        }else {
            System.out.println("enter the valid input");
        }
    }
}
