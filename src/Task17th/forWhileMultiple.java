package Task17th;

public class forWhileMultiple {
    public static void main(String[] args) {
        int j=1;
        for(int i=1;i<=10;i++){
            int mul =5*i;
            System.out.println("5*"+i+"="+mul);
        }
        while(j<=10){
            int mul =5*j;
            System.out.println("5*"+j+"="+mul);
            j++;
        }
    }
}
