package OperatersPackage;

public class TernaryOperator01 {
    public static void main(String[] args) {
        int k=20, j=30;
        int result= k<j ? k : j;
        System.out.println(result);

        int num=-2;
        String evenOrOdd= (num%2 == 0)? "even" : "odd";
        System.out.println(evenOrOdd);

        int x=10; int y=30;
                int z= -50;

        int maxOfThree= (y>x)? ((y>z) ? y : z): x;
        System.out.println(maxOfThree);
    }
}
