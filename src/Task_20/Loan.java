package Task_20;

public class Loan implements LoanInterface {
    private Integer age;
    private Double salary;
    private Integer credit_score;

    public Loan(Integer age, Integer credit_score, Double salary) {
        this.age = age;
        this.credit_score = credit_score;
        this.salary = salary;
    }

    @Override
    public boolean age_Validation() {
        if((age>=18)&&(age<=80)){
            System.out.println("AGE eligible for loan");
            return true;
        }else {

            System.out.println("AGE not eligible for loan");
            return false;
        }

    }

    @Override
    public boolean salary_validation() {
        if((salary>0)&&(salary>=30000)){
            System.out.println("SALARY eligible for loan");
            return true;
        }else {
            System.out.println("SALARY not eligible for loan");
            return false;
        }
    }


    @Override
    public boolean Credit_Score_Validation() {
        int max=850;int min=650;
    if(credit_score>=0){
        if((credit_score>=min)&&(credit_score<=max)){
            System.out.println("CREDIT is maintained good");
            return true;
        }else {
            System.out.println("please maintain a good credit score");
            return false;
        }
    }else {
        System.out.println("Bad Credit_Score ");
        return false;
     }
    }
}
