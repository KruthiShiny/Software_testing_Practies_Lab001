package OperatersPackage;

public class IncrementOperator {
    public static void main(String[] args) {
        /*int i = 11;

        i = i++ + ++i;//12+12=24

        System.out.println(i);

        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;//11+22+12+23+12+23=103

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);

        int i = 1, j = 2, k = 3;//i=0,j=1,k=2

        int m = i-- - j-- - k--;//0-1-2=-3

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);

         */
       // int i=11;
        //i = i++ + ++i;
        //System.out.println(i);

       int a=11; int b=22;
       int c = a + b + a++ + b++ + ++a + ++b;//11+22+12+23+12+23=103

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);

        int i = 1, j = 2, k = 3;//i=0,j=1,k=2

        int m = i-- - j-- - k--;//0-1-2=-3

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
