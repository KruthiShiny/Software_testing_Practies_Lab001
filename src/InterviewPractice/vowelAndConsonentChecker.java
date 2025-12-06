package InterviewPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class vowelAndConsonentChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowel=0;
        int consonent=0;
        System.out.println("enter the message:");
        String str= sc.next();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch+"vowel");
                vowel++;

            }
            else if(ch>='a' && ch<='z'){
                System.out.println(ch+"consonent");
                consonent++;
            }
        }
        System.out.println("vowel:"+vowel);
        System.out.println("consonent:"+consonent);

    }

}
