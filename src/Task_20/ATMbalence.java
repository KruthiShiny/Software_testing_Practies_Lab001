package Task_20;

public class ATMbalence implements ATMinterface{
    double balence;

    public ATMbalence(double balence) {
        this.balence = balence;
    }

    public double getBalence() {
        return balence;
    }
    public void with_drawal(int amount){
        if(amount>balence){
            System.out.println("insuffisient funds");
        }
       else if(amount<0){

            System.out.println("amount shoud be greater than the balence");
        } else if (amount%100!=0) {
            System.out.println("please enter the withdrawal amount in multiples of 100");
        }
       else {
            System.out.println("amount is released");
            balence=balence-amount;

            System.out.println("balence after withdrawal is: "+balence);
        }

    }
}
