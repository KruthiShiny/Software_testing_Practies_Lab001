package PracticePrograms;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class WhileRandom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random=new Random();
        int count=0;
        int systemGeneratedGuess= random.nextInt( 100 )+1;
        System.out.println(systemGeneratedGuess);
        int guess;
        while(true){
            System.out.println("enter your guess: ");
            guess = sc.nextInt();
            count++;
            if(guess>systemGeneratedGuess){
                System.out.println("very high, guess low");
            } else if (guess<systemGeneratedGuess) {
                System.out.println("very low, guess high");

            } else  {
                System.out.println("matched"+systemGeneratedGuess+"="+guess+"\n Attempts:"+count);
                break;
            }


        }
}


}
