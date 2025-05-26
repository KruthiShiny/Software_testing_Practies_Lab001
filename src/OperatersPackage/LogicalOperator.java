package OperatersPackage;

public class LogicalOperator {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        boolean result = x<y && y>x;//t
        boolean result1 = x>=y && y>x; //f
        boolean result2 =x < 5 || x < 4; //f
        boolean result3 = x>=y || y>x;// t
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
