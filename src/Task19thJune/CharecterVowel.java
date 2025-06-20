package Task19thJune;

import java.util.Scanner;

public class CharecterVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowel=0;
        int consonent=0;
        System.out.println("enter the charecter:");
        String str= sc.next().toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch+"is vowel in the given string"+str);
                vowel++;

            }else if((ch>='a') &&(ch<='z')){
                System.out.println(ch+"consonent");
                consonent++;

            }


        }
        System.out.println("vowels"+vowel);
        System.out.println("consonents"+consonent);





    }
}

