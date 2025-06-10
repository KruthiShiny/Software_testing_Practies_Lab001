package TaskPackages;

public class CarConstructor {
    private String brand;
    private String model;
    private int price;

    public CarConstructor(String brand,String model,int price){
        this.brand =brand;
        this.model =model;
        this.price =price;
        System.out.println("brand:"+brand+"\nmodel:"+model+"\nprice:"+price );

    }

    public static void main(String[] args) {
        CarConstructor cc = new CarConstructor("suv","c001",100);

    }
}
