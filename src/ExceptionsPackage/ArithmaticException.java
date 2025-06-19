package ExceptionsPackage;

public class ArithmaticException {

       private int a;
        private int b;

    public ArithmaticException(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void add(){
        int sum= a+b;
        System.out.println(sum);
    }
    public void sub(){
        int diff=a-b;
        System.out.println(diff);
    }
    public void mul(){
        int product=a*b;
        System.out.println(product);
    }
    public void div(){
        if(b==0) {
            try {
                int remainder = a / b;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage()+"Arithmetic exception");
                ;
            }
        }else {
            int remainder2= a/b;
            System.out.println(remainder2);
        }

    }
}
