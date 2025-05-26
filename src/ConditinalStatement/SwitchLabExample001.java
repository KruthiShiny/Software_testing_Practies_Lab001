package ConditinalStatement;

import java.util.Scanner;

public class SwitchLabExample001 {
    public static void main(String[] args) {
        int day =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number and I will tell you which day in a week it is:");

        if(sc.hasNextInt()) {
            day = sc.nextInt();
        }
        else {
            System.out.println("the input given did not match");
        }

            switch (day){
                case 1:
                    System.out.println("mon");
                    break;

                case 2:
                    System.out.println("tues");
                break;
                case 3:
                    System.out.println("wed");
                break;
                case 4:
                    System.out.println("thur");
                break;
                case 5:
                    System.out.println("fri");
                break;
                case 6:
                    System.out.println("sat");
                break;
                case 7:
                    System.out.println("sun");
                break;
                default:

                    System.out.println("please enter within 1-7 number");

            }
        }


    }

