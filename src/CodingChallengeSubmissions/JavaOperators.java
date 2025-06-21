package CodingChallengeSubmissions;

public class JavaOperators {
    public static void main(String[] args) {
        int a=5;//6,7
        int b=4;//3,4
        String c="12";
        String d= "10";
        int e= Integer.parseInt(c);
        int f= Integer.parseInt(d);

        System.out.println(b-- -++a);//4-6=-2

        System.out.println(e += f);//12+10=22

        System.out.println(a++ + ++b);//6+4=10

        System.out.println((a+b)/(a-b));//11/3=3
    }
}
