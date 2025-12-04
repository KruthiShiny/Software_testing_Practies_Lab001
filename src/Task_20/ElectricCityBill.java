package Task_20;

public class ElectricCityBill implements ElectricCityInterface{
    double units;
    public ElectricCityBill(double units) {
        this.units = units;
    }

    @Override
    public double RateStructure() {
        if(units<=100){
            System.out.println(units*0.50+"-Rs need to be paid for consumed"+units+" units");
        }
        else if((units>=101)||(units<=200)){
            System.out.println(units*0.75+"-Rs need to be paid for consumed"+units+" units");
        }
        else if((units>=201)||(units<=300)){
            System.out.println(units*1.20+"-Rs need to be paid for consumed"+units+" units");
        }
        else if(units>=300){
            System.out.println(units*1.50+"-Rs need to be paid for consumed"+units+" units");
        }
        else {
            System.out.println("invalid input");
        }

        return 0;
    }
}
