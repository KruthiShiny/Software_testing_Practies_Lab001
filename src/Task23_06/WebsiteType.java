package Task23_06;

import java.util.Scanner;

public class WebsiteType {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Url:");
        String url= sc.next().toLowerCase();
        int len= url.length()-3;
        String str="";

        String str1="com";
        String str2="org";
        for(int i=len;i<url.length();i++){
            str += url.charAt(i);
            //System.out.print(str);
        }
        switch (str){
            case "com":
                System.out.println(" The website type is: Commercial website");
                break;
                case "org":
                System.out.println("The website type is: Non-profit organization");
                break;
                case "edu":
                System.out.println("The website type is: Educational institution");
                break;
                case "gov":
                System.out.println("The website type is: Government website");
                break;
                case "net":
                System.out.println("The website type is: Network-related website");
                break;
                //case "info":
                //System.out.println("The website type is: Informational website");
                //break;
                case "xyz":
                System.out.println("The website type is: Unknown or other types of websites");
                break;
        }


    }
}
