package ConditinalStatement;

import java.util.Scanner;

public class SwitchTask004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Grade of the child to know his performence level: ");
        String grade = sc.next();
        grade = grade.toLowerCase();
        switch (grade) {
            case "a":
                System.out.println("excellent");
                break;
            case "b":
                System.out.println("Good, scope for improvment");
                break;
            case "c":
                System.out.println("Not Expected");
                break;
            case "d":
                System.out.println("Fail");
                break;
            default:
                System.out.println("please enter the grade within A - D other than this are invalid grades");
                break;

        }


    }
}
