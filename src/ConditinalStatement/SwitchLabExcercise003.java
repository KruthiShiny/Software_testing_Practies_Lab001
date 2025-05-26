package ConditinalStatement;

import java.util.Locale;
import java.util.Scanner;

public class SwitchLabExcercise003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the browser name: ");
        String browser=sc.next();
        browser =browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("its a chrome browser");
                break;
            case "fire fox":
                System.out.println("its a chrome firefox browser");
                break;
            default:
                System.out.println("the entered browser doesnot support");

        }

    }
}
