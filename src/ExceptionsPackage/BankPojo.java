package ExceptionsPackage;

public class BankPojo {
    private String currency;
    private Integer amount;

    public BankPojo(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Integer add(BankPojo bank){
        if(bank.currency.equalsIgnoreCase("INR"))
        {
            return bank.amount+this.amount;
        }
        else {
            try {
            throw new CustomException("Currency mismatch");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


    }
}
class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}
