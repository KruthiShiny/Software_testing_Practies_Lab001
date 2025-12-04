package Task_20;

public class NumberPalindrome {
    public static void main(String[] args) {
        String str="12121";
        int len= str.length();
        char stright=0;
        char reverse=0;
        for(int i=0;i<len;i++){
            stright = str.charAt(i);
            reverse= str.charAt(str.length()-i-1);
           // System.out.print(stright);
            //System.out.print("\n");
            //System.out.print(reverse);
        }

        if(stright!=reverse){
            System.out.println("not a palindrome");
        }else {
            System.out.println("palindrome");
        }
    }
}
