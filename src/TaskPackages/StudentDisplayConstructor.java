package TaskPackages;

public class StudentDisplayConstructor {
    private String name;
    private int age;

    public StudentDisplayConstructor(String name,int age) {
        this.age = age;
        this.name = name;
    }
    public void display(){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
    }

    public static void main(String[] args) {
        StudentDisplayConstructor studentDisplayConstructor=new StudentDisplayConstructor("kruthi",30);
        studentDisplayConstructor.display();
    }


}
