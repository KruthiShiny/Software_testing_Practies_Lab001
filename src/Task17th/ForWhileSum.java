package Task17th;

public class ForWhileSum {
    public static void main(String[] args) {
        int sum=0;
        int sum2=0;
        int j=1;
        for(int i=1;i<=10;i++){
             sum=sum+i;
        }
        System.out.println(sum);
        while(j<=10){
            sum2=sum2+j;
            j++;
        }
        System.out.println(sum2);
    }
}
