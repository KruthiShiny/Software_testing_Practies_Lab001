package TaskPackages;

public class Mobile {
    private String brand;
    private double price;

    public void mobile()
    {
        this.brand= brand;
        System.out.println("Mobile Brand : "+brand);
    }
    public void mobile(String brand,double price){
        this.brand= brand;
        this.price = price;
        System.out.println("the mobile brand and price is : "+brand+","+price);
    }

    public static void main(String[] args) {
        Mobile mb = new Mobile();

        mb.mobile("Samsung",30900.96);
        mb.mobile();


    }

}
