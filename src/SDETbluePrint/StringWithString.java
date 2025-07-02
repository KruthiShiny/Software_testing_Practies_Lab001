package SDETbluePrint;

public class StringWithString {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="hello";
        String str3="Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println("equals():"+str1.equals(str2)+", equalsIgnoreCase():"+str1.equalsIgnoreCase(str2)+
                ", compareTo():"+str1.compareTo(str2));
    }
}
