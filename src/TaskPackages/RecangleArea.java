package TaskPackages;

public class RecangleArea {
    private double length;
    private double breadth;

    public RecangleArea(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }
    public double area(){
        double area = length*breadth;
        return area;
    }

    public static void main(String[] args) {
        RecangleArea ra = new RecangleArea(3.5,5);
        System.out.println("The length is: "+ ra.length+"\nbreadth is : "+ra.breadth+"\nand the area is: " +
                ra.area());

    }
}
