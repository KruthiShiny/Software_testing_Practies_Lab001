package Task19thJune;

public class LargestOfThree {
    public static void main(String[] args) {
        int x=1000;
       int y=100;
        int z=800;
     if((y>x) && (y>z))
     {
         System.out.println(y+"is greater");
     } else if (x>z) {
         System.out.println(x+"is greater");
     }
     else {
         System.out.println(z+"is greater");
     }


    }
}
