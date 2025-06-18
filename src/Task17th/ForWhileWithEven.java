package Task17th;

public class ForWhileWithEven {
    public static void main(String[] args) {
        int j = 1;
//        for(int i=1;i<=20;i++){
//            if(i%2==0){
//                System.out.println(i+"is even");
//            }
//            else {
//                System.out.println(i+"is odd");
//            }
//        }
        while (j <= 20) {
            if (j % 2 == 0) {
               System.out.println(j+"is even");
            }
            else {
                System.out.println(j+"is odd");
           }
                j++;
            }
        }
    }
