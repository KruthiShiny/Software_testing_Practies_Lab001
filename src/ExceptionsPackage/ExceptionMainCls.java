package ExceptionsPackage;

public class ExceptionMainCls {
    public static void main(String[] args) {
        BankPojo sbi= new BankPojo(100,"INR");
        BankPojo icici=new BankPojo(200,"USD");
        System.out.println(sbi.add(icici));
    }
}
