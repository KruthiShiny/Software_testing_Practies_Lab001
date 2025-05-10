import java.util.Scanner;

public class ReadingStringFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("what is your name: ");
        String name=sc.nextLine();
        System.out.print("what is your age: ");
        int age=sc.nextInt();
        System.out.println("My Name is: "+name+ ",My age is: "+age+".");



    }
}
