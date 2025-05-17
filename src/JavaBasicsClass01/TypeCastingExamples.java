package JavaBasicsClass01;

public class TypeCastingExamples {
    public static void main(String[] args) {
        int a=300;
        float b= a; //implicit type casting is happening
        short c=300;
        byte d= (byte)c;//explicitly typecasting

        System.out.println(b);
        System.out.println(d);
    }
}
