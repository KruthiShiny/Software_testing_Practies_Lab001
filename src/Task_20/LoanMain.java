package Task_20;

public class LoanMain {
    public static void main(String[] args) {
        Loan ln=new Loan(30,70,40000.00);
        if((ln.age_Validation()==true)&& (ln.salary_validation()==true)&&(ln.Credit_Score_Validation()==true)){
            System.out.println("-------------------------");
                    System.out.println("Profile is eligible for loan");
                }
        else {
            System.out.println("not eligible");
        }

    }
}
